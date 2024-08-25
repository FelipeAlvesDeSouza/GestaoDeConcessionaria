package br.edu.infnet.appFelipeAlves.model.service;

import br.edu.infnet.appFelipeAlves.model.domain.Eletrico;
import br.edu.infnet.appFelipeAlves.model.domain.Hibrido;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class EletricoService {
    Map<Integer , Eletrico> mapa = new HashMap<Integer , Eletrico>();
    private Integer id = 0;
    public void incluir (Eletrico carroEletrico)
    {
        carroEletrico.setId(++id);

        mapa.put(carroEletrico.getId(), carroEletrico);
    }

    public Collection<Eletrico> obterLista()
    {
        return mapa.values();
    }

    public Eletrico obterPorId(Integer id)
    {
        return mapa.get(id);
    }

}
