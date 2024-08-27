package br.edu.infnet.appFelipeAlves.model.Controller;

import br.edu.infnet.appFelipeAlves.model.Domain.Vendedor;
import br.edu.infnet.appFelipeAlves.model.Service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    @GetMapping(value = "vendedores")
    public Iterable<Vendedor> obterListaVendedores()
    {
        return vendedorService.obterLista();
    }

    @GetMapping(value = "vendedor/{id}")
    public Vendedor obterPorId(@PathVariable Integer id)
    {
        return vendedorService.obterPorId(id);
    }
}
