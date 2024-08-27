package br.edu.infnet.appFelipeAlves.model.Repository;

import br.edu.infnet.appFelipeAlves.model.Domain.Transacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends CrudRepository <Transacao, Integer> {}
