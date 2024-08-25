package br.edu.infnet.appFelipeAlves;

import br.edu.infnet.appFelipeAlves.model.domain.Eletrico;
import br.edu.infnet.appFelipeAlves.model.domain.Hibrido;
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
public class HibridoLoader implements ApplicationRunner {

    @Autowired
    private HibridoService carroHibridoService;

    @Override
    public void run(ApplicationArguments args) throws Exception
    {
        FileReader file = new FileReader("src/main/files/carroHibrido.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();
        String[] campos = null;

        while(linha != null)
        {
            campos = linha.split(";");

            Hibrido carroHibrido = new Hibrido();

            carroHibrido.setNome(campos[0]);
            carroHibrido.setValor(Double.valueOf(campos[1]));
            carroHibrido.setCor(campos[2]);
            carroHibrido.setMarca(campos[3]);
            carroHibrido.setTipoCarroceria(campos[4]);

            carroHibridoService.incluir(carroHibrido);

            linha = leitura.readLine();

        }

        for (Hibrido carroHibrido : carroHibridoService.obterLista())
        {
            System.out.println("[CARRO HIBRIDO - LOADER] " + carroHibrido);
        }

        file.close();

    }
}
