package br.edu.infnet.appFelipeAlves;

import br.edu.infnet.appFelipeAlves.model.domain.Eletrico;
import br.edu.infnet.appFelipeAlves.model.service.EletricoService;
import br.edu.infnet.appFelipeAlves.model.service.HibridoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

@Component

public class EletricoLoader implements ApplicationRunner {
    @Autowired
    private EletricoService carroEletricoService;

    @Override
    public void run(ApplicationArguments args) throws Exception
    {

        FileReader file = new FileReader("src/main/files/carroEletrico.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();
        String[] campos = null;

        while(linha != null)
        {
            campos = linha.split(";");

            Eletrico carroEletrico = new Eletrico();

            carroEletrico.setNome(campos[0]);
            carroEletrico.setValor(Double.valueOf(campos[1]));
            carroEletrico.setCor(campos[2]);
            carroEletrico.setMarca(campos[3]);
            carroEletrico.setTipoCarroceria(campos[4]);

            carroEletricoService.incluir(carroEletrico);

            linha = leitura.readLine();

        }

        for (Eletrico carroEletrico: carroEletricoService.obterLista())
        {
            System.out.println("[CARRO ELÉTRICO - LOADER] " + carroEletrico);
        }

        file.close();
    }
}
