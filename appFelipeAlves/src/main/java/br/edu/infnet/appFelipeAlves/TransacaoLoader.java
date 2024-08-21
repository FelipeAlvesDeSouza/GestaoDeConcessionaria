package br.edu.infnet.appFelipeAlves;

import br.edu.infnet.appFelipeAlves.model.domain.Transacao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
public class TransacaoLoader implements ApplicationRunner {


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

            System.out.println("[TRANSAÇÃO] " + transacao);

            linha = leitura.readLine();
        }

        file.close();
    }
}
