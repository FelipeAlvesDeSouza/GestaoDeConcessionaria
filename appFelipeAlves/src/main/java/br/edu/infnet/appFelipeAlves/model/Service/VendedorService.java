package br.edu.infnet.appFelipeAlves.model.Service;

import br.edu.infnet.appFelipeAlves.model.Domain.Vendedor;
import br.edu.infnet.appFelipeAlves.model.Repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class VendedorService {
    @Autowired
    private VendedorRepository vendedorRepository;


    public void incluir (Vendedor vendedor)
    {
        vendedorRepository.save(vendedor);
    }

    public Iterable<Vendedor> obterLista()
    {
        return vendedorRepository.findAll();
    }

    public Vendedor obterPorId(Integer id)
    {
        return vendedorRepository.findById(id).orElse(null);
    }
}
