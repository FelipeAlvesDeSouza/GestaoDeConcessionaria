package br.edu.infnet.appFelipeAlves;

import br.edu.infnet.appFelipeAlves.model.domain.Carro;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
public class CarroLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception
    {
        FileReader file = new FileReader("src/main/files/carro.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();
        String[] campos = null;

        while(linha != null)
        {
            campos = linha.split(";");

            Carro carro = new Carro();

            carro.setCor(campos[0]);
            carro.setNome(campos[1]);
            carro.setEstoque(Boolean.parseBoolean(campos[2]));
            carro.setValor(Double.valueOf(campos[3]));

            System.out.println( "[CARRO] " + carro);

            linha = leitura.readLine();
        }


        file.close();
    }
}
