package br.edu.infnet.appFelipeAlves;

import br.edu.infnet.appFelipeAlves.model.domain.Eletrico;
import br.edu.infnet.appFelipeAlves.model.domain.Hibrido;
import br.edu.infnet.appFelipeAlves.model.domain.Vendedor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

@Component
public class VendedorLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception
    {

        Map<Integer , Vendedor> map = new HashMap<Integer, Vendedor>();
        Integer id = 0;


        FileReader file = new FileReader("src/main/files/vendedor.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();
        String [] campos = null;

        Vendedor vendedor = null;

        while(linha != null)
        {
            campos = linha.split(";");

            switch (campos[0].toUpperCase())
            {
                case "V":
                    vendedor = new Vendedor();

                    vendedor.setId(++id);
                    vendedor.setCpf(campos[1]);
                    vendedor.setEmail(campos[2]);
                    vendedor.setNome(campos[3]);
                    vendedor.setSalario(Double.valueOf(campos[4]));

                    map.put(vendedor.getId(), vendedor);

                    break;

                case "H":
                    Hibrido carroHibrido = new Hibrido();

                    carroHibrido.setNome(campos[1]);
                    carroHibrido.setValor(Double.valueOf(campos[2]));
                    carroHibrido.setCor(campos[3]);
                    carroHibrido.setMarca(campos[4]);
                    carroHibrido.setTipoCarroceria(campos[5]);


                   vendedor.getCarros().add(carroHibrido);

                   break;

                case "E":
                    Eletrico carroEletrico = new Eletrico();

                    carroEletrico.setNome(campos[1]);
                    carroEletrico.setValor(Double.valueOf(campos[2]));
                    carroEletrico.setCor(campos[3]);
                    carroEletrico.setMarca(campos[4]);
                    carroEletrico.setTipoCarroceria(campos[5]);

                    vendedor.getCarros().add(carroEletrico);

                    break;

                default:
                    break;
            }


            linha = leitura.readLine();
        }

        for (Vendedor vendedores : map.values())
        {
            System.out.println("[VENDEDORES] " + vendedores);
        }


        file.close();
    }
}
