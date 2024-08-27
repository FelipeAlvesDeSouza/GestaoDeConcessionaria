package br.edu.infnet.appFelipeAlves.model.Controller;

import br.edu.infnet.appFelipeAlves.model.Domain.Eletrico;
import br.edu.infnet.appFelipeAlves.model.Service.EletricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class EletricoController {

    @Autowired
    private EletricoService eletricoService;

    @GetMapping(value = "carrosEletricos")
    public Iterable<Eletrico> obterListaCarrosEletronicos()
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
