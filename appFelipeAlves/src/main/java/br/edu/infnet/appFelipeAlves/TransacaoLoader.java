package br.edu.infnet.appFelipeAlves;

import br.edu.infnet.appFelipeAlves.model.Domain.Transacao;
import br.edu.infnet.appFelipeAlves.model.Service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
public class TransacaoLoader implements ApplicationRunner {
    @Autowired
    private TransacaoService transacaoService;


    @Override
    public void run(ApplicationArguments args) throws Exception
    {

        FileReader file = new FileReader("src/main/files/transacao.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();
        String [] campos = null;

        while(linha != null)
        {
            campos = linha.split(";");

            Transacao transacao = new Transacao();

            transacao.setFormaPagamento(campos[0]);
            transacao.setMetodoPagamento(campos[1]);
            transacao.setAprovado(Boolean.parseBoolean(campos[2]));


            transacaoService.incluir(transacao);


            linha = leitura.readLine();
        }

        for (Transacao transacao : transacaoService.obterLista())
        {
            System.out.println("[TRANSAÇÃO - LOADER] " + transacao);
        }

        file.close();
    }
}
