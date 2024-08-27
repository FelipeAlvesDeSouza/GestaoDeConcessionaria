package br.edu.infnet.appFelipeAlves.model.Controller;

import br.edu.infnet.appFelipeAlves.model.Domain.Hibrido;
import br.edu.infnet.appFelipeAlves.model.Service.HibridoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class HibridoController {
    @Autowired
    private HibridoService hibridoService;

    @GetMapping(value = "carrosHibridos")
    public Iterable<Hibrido> obterListaCarrosHibridos()
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
