package br.edu.infnet.appFelipeAlves.model.Controller;

import br.edu.infnet.appFelipeAlves.model.domain.Eletrico;
import br.edu.infnet.appFelipeAlves.model.domain.Hibrido;
import br.edu.infnet.appFelipeAlves.model.service.EletricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "carrosEletricos/{id}")
    public Eletrico obterPorId(@PathVariable Integer id)
    {
        return eletricoService.obterPorId(id);
    }

    @PostMapping(value = "carrosEletricos/incluir")
    public String incluir(@RequestBody Eletrico carroEletrico)
    {
        eletricoService.incluir(carroEletrico);

        return "Adicionado com Sucesso ! :)";
    }
}
