package com.accenture.academico.onlinebank.service;


import com.accenture.academico.onlinebank.dao.ClienteDaoI;
import com.accenture.academico.onlinebank.model.Cliente;
import com.accenture.academico.onlinebank.model.ContaCorrente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    @NotBlank
    @Autowired
    private ClienteDaoI dao;

    private Cliente cliente;
    private List<ContaCorrente> contas = new ArrayList<>();

    public ClienteService(){
    }

    public Cliente cadastraCliente(Cliente cliente) {

        if (cliente.getIdCliente() > 0){
            this.cliente = dao.findById(cliente.getIdCliente()).get();

            for (int i = 0; i < this.cliente.getContaCorrentes().size(); i++){
                this.contas.add(this.cliente.getContaCorrentes().get(i));
            }

            for (int i = 0; i < cliente.getContaCorrentes().size(); i++){
                this.contas.add(cliente.getContaCorrentes().get(i));
            }

            cliente.setContaCorrentes(this.contas);
            return dao.save(cliente);

        } else {
            this.cliente = cliente;
            return dao.save(cliente);
        }

    }

    public ResponseEntity consultarCliente(Integer id) {
        return dao.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    public List<Cliente> consultaClientes() {
        return (List<Cliente>) dao.findAll();
    }

    public boolean deletarCliente(Cliente cliente) {

        this.cliente = cliente;

        if (dao.findById(this.cliente.getIdCliente()).get().getIdCliente() == this.cliente.getIdCliente()) {
            dao.delete(this.cliente);
            return true;
        } else {
            return false;
        }
    }

}
