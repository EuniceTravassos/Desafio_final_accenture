package com.accenture.academico.onlinebank.dao;

import com.accenture.academico.onlinebank.model.ContaCorrente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaCorrenteDaoI  extends CrudRepository<ContaCorrente, Integer> {
}
