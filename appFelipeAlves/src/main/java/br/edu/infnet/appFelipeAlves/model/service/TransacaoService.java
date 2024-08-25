package br.edu.infnet.appFelipeAlves.model.service;

import br.edu.infnet.appFelipeAlves.model.domain.Eletrico;
import br.edu.infnet.appFelipeAlves.model.domain.Transacao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class TransacaoService {

    Map<Integer , Transacao> mapa = new HashMap<Integer , Transacao>();
    private Integer id = 0;
    public void incluir (Transacao transacao)
    {
        transacao.setId(++id);

        mapa.put(transacao.getId(), transacao);
    }

    public Collection<Transacao> obterLista()
    {
        return mapa.values();
    }
}
