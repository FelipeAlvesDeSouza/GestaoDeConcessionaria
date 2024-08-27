package br.edu.infnet.appFelipeAlves.model.Service;

import br.edu.infnet.appFelipeAlves.model.Domain.Hibrido;
import br.edu.infnet.appFelipeAlves.model.Repository.HibridoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HibridoService {

    @Autowired
    private HibridoRepository hibridoRepository;
    public void incluir(Hibrido carroHibrido)
    {
        hibridoRepository.save(carroHibrido);
    }

    public Iterable<Hibrido> obterLista()
    {
        return hibridoRepository.findAll();
    }

    public Hibrido obterPorId(Integer id)
    {
        return hibridoRepository.findById(id).orElse(null);
    }

    public void excluir (Integer id)
    {
        hibridoRepository.deleteById(id);
    }


}
