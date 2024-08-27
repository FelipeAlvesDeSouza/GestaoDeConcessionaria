package br.edu.infnet.appFelipeAlves.model.Service;

import br.edu.infnet.appFelipeAlves.model.Domain.Eletrico;
import br.edu.infnet.appFelipeAlves.model.Domain.Hibrido;
import br.edu.infnet.appFelipeAlves.model.Repository.EletricoRepository;
import br.edu.infnet.appFelipeAlves.model.Repository.HibridoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class EletricoService {
    @Autowired
    private EletricoRepository eletricoRepository;
    public void incluir(Eletrico carroEletrico)
    {
        eletricoRepository.save(carroEletrico);
    }

    public Iterable<Eletrico> obterLista()
    {
        return eletricoRepository.findAll();
    }

    public Eletrico obterPorId(Integer id)
    {
        return eletricoRepository.findById(id).orElse(null);
    }

    public void excluir (Integer id)
    {
        eletricoRepository.deleteById(id);
    }

}
