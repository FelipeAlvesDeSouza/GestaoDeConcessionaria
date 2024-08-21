package br.edu.infnet.appFelipeAlves;

import br.edu.infnet.appFelipeAlves.model.domain.Vendedor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
public class VendedorLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception
    {


        FileReader file = new FileReader("src/main/files/vendedor.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();
        String [] campos = null;

        while(linha != null)
        {
            campos = linha.split(";");

            Vendedor vendedor = new Vendedor();

            vendedor.setCpf(campos[0]);
            vendedor.setEmail(campos[1]);
            vendedor.setNome(campos[2]);
            vendedor.setSalario(Double.valueOf(campos[3]));

            System.out.println("[VENDEDOR] " + vendedor);

            linha = leitura.readLine();
        }

        file.close();
    }
}
