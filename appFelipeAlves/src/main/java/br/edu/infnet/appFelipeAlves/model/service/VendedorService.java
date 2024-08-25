package br.edu.infnet.appFelipeAlves.model.service;

import br.edu.infnet.appFelipeAlves.model.domain.Eletrico;
import br.edu.infnet.appFelipeAlves.model.domain.Vendedor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class VendedorService {
    Map<Integer , Vendedor> mapa = new HashMap<Integer, Vendedor>();
    Integer id = 0;


    public void incluir (Vendedor vendedor)
    {
        vendedor.setId(++id);

        mapa.put(vendedor.getId(), vendedor);
    }

    public Collection<Vendedor> obterLista()
    {
        return mapa.values();
    }

    public Vendedor obterPorId(Integer id)
    {
        return mapa.get(id);
    }
}
