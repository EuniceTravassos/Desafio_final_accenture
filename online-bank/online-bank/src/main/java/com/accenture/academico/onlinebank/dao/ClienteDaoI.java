package com.accenture.academico.onlinebank.dao;

import com.accenture.academico.onlinebank.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDaoI extends CrudRepository<Cliente, Integer> {
}
