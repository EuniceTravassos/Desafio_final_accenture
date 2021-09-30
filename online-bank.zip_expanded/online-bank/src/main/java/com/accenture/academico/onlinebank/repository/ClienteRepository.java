package com.accenture.academico.onlinebank.repository;

import com.accenture.academico.onlinebank.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
}
