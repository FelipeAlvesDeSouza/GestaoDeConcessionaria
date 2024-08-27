package br.edu.infnet.appFelipeAlves.model.Repository;

import br.edu.infnet.appFelipeAlves.model.Domain.Eletrico;
import br.edu.infnet.appFelipeAlves.model.Domain.Hibrido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EletricoRepository extends CrudRepository<Eletrico, Integer> { }
