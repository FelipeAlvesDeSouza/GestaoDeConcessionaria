package br.edu.infnet.appFelipeAlves.model.Controller;

import br.edu.infnet.appFelipeAlves.model.Domain.Transacao;
import br.edu.infnet.appFelipeAlves.model.Service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;

    @GetMapping(value = "transacoes")
    public Iterable<Transacao> obterListaTransacao()
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
