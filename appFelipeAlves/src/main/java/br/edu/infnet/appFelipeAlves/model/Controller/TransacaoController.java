package br.edu.infnet.appFelipeAlves.model.Controller;

import br.edu.infnet.appFelipeAlves.model.domain.Eletrico;
import br.edu.infnet.appFelipeAlves.model.domain.Hibrido;
import br.edu.infnet.appFelipeAlves.model.domain.Transacao;
import br.edu.infnet.appFelipeAlves.model.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "transacao/{id}")
    public Transacao obterPorId(@PathVariable Integer id)
    {
        return transacaoService.obterPorId(id);
    }

    @PostMapping(value = "transacao/incluir")
    public String incluir(@RequestBody Transacao transacao)
    {
        transacaoService.incluir(transacao);

        return "Adicionado com Sucesso ! :)";
    }
}
