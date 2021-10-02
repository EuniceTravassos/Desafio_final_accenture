package com.accenture.academico.onlinebank.service;

import com.accenture.academico.onlinebank.dao.AgenciaDaoI;
import com.accenture.academico.onlinebank.model.Agencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenciaService {

    @Autowired
    private AgenciaDaoI dao;

    private Agencia agencia;

    public  AgenciaService() {

    }

    public Agencia cadastraAgencia(Agencia cliente) {
        this.agencia = cliente;
        return dao.save(this.agencia);
    }

    public ResponseEntity consultarAgencia(Integer id) {
        return dao.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    public List<Agencia> consultaAgencias () {
        return (List<Agencia>) dao.findAll();
    }

    public boolean deletarAgencia(Agencia agencia) {
        this.agencia = agencia;

        if(dao.findById(agencia.getIdAgencia()).get().getIdAgencia() == this.agencia.getIdAgencia()) {
            dao.delete(agencia);
            return true;
        } else {
            return false;
        }
    }

}
