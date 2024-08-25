package br.edu.infnet.appFelipeAlves.model.Controller;

import br.edu.infnet.appFelipeAlves.model.domain.Eletrico;
import br.edu.infnet.appFelipeAlves.model.domain.Hibrido;
import br.edu.infnet.appFelipeAlves.model.service.HibridoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class HibridoController {
    @Autowired
    private HibridoService hibridoService;

    @GetMapping(value = "carrosHibridos")
    public Collection<Hibrido> obterListaCarrosHibridos()
    {
        return hibridoService.obterLista();
    }

    @GetMapping(value = "carrosHibridos/{id}")
    public Hibrido obterPorId(@PathVariable Integer id)
    {
        return hibridoService.obterPorId(id);
    }

    @PostMapping(value = "carrosHibridos/incluir")
    public String incluir(@RequestBody Hibrido carroHibrido)
    {
        hibridoService.incluir(carroHibrido);

        return "Adicionado com Sucesso ! :)";
    }

    @DeleteMapping(value = "carrosHibridos/{id}/excluir")
    public String excluir(@PathVariable Integer id)
    {
        hibridoService.excluir(id);

        return "Excluido com sucesso ! :)";
    }

}
