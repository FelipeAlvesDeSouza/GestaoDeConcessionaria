package br.edu.infnet.appFelipeAlves.model.Controller;

import br.edu.infnet.appFelipeAlves.model.domain.Transacao;
import br.edu.infnet.appFelipeAlves.model.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;

    @GetMapping(value = "transacoes")
    public Collection<Transacao> obterListaTransacao()
    {
        return transacaoService.obterLista();
    }
}
