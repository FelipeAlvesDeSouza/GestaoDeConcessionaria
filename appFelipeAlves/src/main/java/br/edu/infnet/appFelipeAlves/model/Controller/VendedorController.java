package br.edu.infnet.appFelipeAlves.model.Controller;

import br.edu.infnet.appFelipeAlves.model.domain.Vendedor;
import br.edu.infnet.appFelipeAlves.model.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    @GetMapping(value = "vendedores")
    public Collection<Vendedor> obterListaVendedores()
    {
        return vendedorService.obterLista();
    }

}
