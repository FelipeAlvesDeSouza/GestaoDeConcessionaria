package br.edu.infnet.appFelipeAlves.model.Repository;

import br.edu.infnet.appFelipeAlves.model.Domain.Vendedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends CrudRepository<Vendedor , Integer> { }

