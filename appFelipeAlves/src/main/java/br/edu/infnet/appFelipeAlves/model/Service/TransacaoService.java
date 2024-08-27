package br.edu.infnet.appFelipeAlves.model.Service;

import br.edu.infnet.appFelipeAlves.model.Domain.Transacao;
import br.edu.infnet.appFelipeAlves.model.Repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class TransacaoService {

    @Autowired
    TransacaoRepository transacaoRepository;

    public void incluir (Transacao transacao)
    {
        transacaoRepository.save(transacao);
    }

    public Iterable<Transacao> obterLista()
    {
        return transacaoRepository.findAll();
    }

    public Transacao obterPorId(Integer id)
    {
        return transacaoRepository.findById(id).orElse(null);
    }
}
