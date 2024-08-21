package br.edu.infnet.appFelipeAlves;

import br.edu.infnet.appFelipeAlves.model.domain.Eletrico;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component

public class EletricoLoader implements ApplicationRunner {

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

            System.out.println("[CARRO ELÉTRICO] " + carroEletrico);

            linha = leitura.readLine();

        }

        file.close();
    }
}
