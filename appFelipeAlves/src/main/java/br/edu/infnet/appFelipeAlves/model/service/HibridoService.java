package br.edu.infnet.appFelipeAlves.model.service;

import br.edu.infnet.appFelipeAlves.model.domain.Hibrido;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HibridoService {

    Map<Integer , Hibrido> mapa = new HashMap<Integer , Hibrido>();

    Integer id = 0;
    public void incluir(Hibrido carroHibrido)
    {
        carroHibrido.setId(++id);

        mapa.put(carroHibrido.getId(), carroHibrido);
    }


    public Collection<Hibrido> obterLista()
    {
        return mapa.values();
    }

}
