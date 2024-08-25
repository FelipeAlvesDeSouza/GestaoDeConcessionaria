package br.edu.infnet.appFelipeAlves.model.Controller;

import br.edu.infnet.appFelipeAlves.model.domain.Hibrido;
import br.edu.infnet.appFelipeAlves.model.service.HibridoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
