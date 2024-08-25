package br.edu.infnet.appFelipeAlves.model.Controller;

import br.edu.infnet.appFelipeAlves.model.domain.Eletrico;
import br.edu.infnet.appFelipeAlves.model.service.EletricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class EletricoController {

    @Autowired
    private EletricoService eletricoService;

    @GetMapping(value = "carrosEletricos")
    public Collection<Eletrico> obterListaCarrosEletronicos()
    {
        return eletricoService.obterLista();
    }
}
