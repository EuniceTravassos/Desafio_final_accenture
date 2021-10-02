package com.accenture.academico.onlinebank.dao;

import com.accenture.academico.onlinebank.model.Extrato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtratoDaoI extends CrudRepository<Extrato, Integer> {
}
