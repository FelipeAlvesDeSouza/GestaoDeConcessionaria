package br.edu.infnet.appFelipeAlves;

import br.edu.infnet.appFelipeAlves.model.Domain.Eletrico;
import br.edu.infnet.appFelipeAlves.model.Domain.Hibrido;
import br.edu.infnet.appFelipeAlves.model.Domain.Transacao;
import br.edu.infnet.appFelipeAlves.model.Domain.Vendedor;
import br.edu.infnet.appFelipeAlves.model.Service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
@Order(1)
public class VendedorLoader implements ApplicationRunner {

    @Autowired
    private VendedorService vendedorService;

    @Override
    public void run(ApplicationArguments args) throws Exception
    {

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

                    vendedor.setCpf(campos[1]);
                    vendedor.setEmail(campos[2]);
                    vendedor.setNome(campos[3]);
                    vendedor.setSalario(Double.valueOf(campos[4]));

                    vendedorService.incluir(vendedor);
                    break;

                case "H":
                    Hibrido carroHibrido = new Hibrido();

                    carroHibrido.setNome(campos[1]);
                    carroHibrido.setValor(Double.valueOf(campos[2]));
                    carroHibrido.setCor(campos[3]);
                    carroHibrido.setMarca(campos[4]);
                    carroHibrido.setTipoCarroceria(campos[5]);


                   vendedor.getCarros().add(carroHibrido);

                    System.out.println("[CARRO HIBRIDO - VENDEDOR] " + carroHibrido);

                   break;

                case "E":
                    Eletrico carroEletrico = new Eletrico();

                    carroEletrico.setNome(campos[1]);
                    carroEletrico.setValor(Double.valueOf(campos[2]));
                    carroEletrico.setCor(campos[3]);
                    carroEletrico.setMarca(campos[4]);
                    carroEletrico.setTipoCarroceria(campos[5]);

                    vendedor.getCarros().add(carroEletrico);


                    System.out.println("[CARRO ELÉTRICO - VENDEDOR] " + carroEletrico);
                    break;

                case "T":
                    Transacao transacao = new Transacao();

                    transacao.setFormaPagamento(campos[1]);
                    transacao.setMetodoPagamento(campos[2]);
                    transacao.setAprovado(Boolean.parseBoolean(campos[3]));

                    System.out.println("[TRANSAÇÃO] " + transacao);

                default:
                    break;
            }


            linha = leitura.readLine();
        }

        for (Vendedor vendedores : vendedorService.obterLista())
        {
            System.out.println("[VENDEDORES - LOADER] " + vendedores);
        }


        file.close();
    }
}