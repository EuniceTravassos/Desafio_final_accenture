package com.accenture.academico.onlinebank.dao;

import com.accenture.academico.onlinebank.model.Agencia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenciaDaoI extends CrudRepository<Agencia, Integer> {
}
