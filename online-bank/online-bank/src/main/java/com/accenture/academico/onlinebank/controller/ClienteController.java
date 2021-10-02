package com.accenture.academico.onlinebank.controller;

import com.accenture.academico.onlinebank.model.Cliente;
import com.accenture.academico.onlinebank.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping(path = "/cliente/{id}")
    public ResponseEntity consultaCliente(@PathVariable Integer id) {
        return service.consultarCliente(id);
    }

    @PostMapping(path = "/cliente")
    public Cliente cadastraCliente(@Valid @RequestBody Cliente cliente) {
        return service.cadastraCliente(cliente);
    }

    @GetMapping(path = "clientes")
    public List<Cliente> consultaClientes() {
        return service.consultaClientes();
    }

    @PostMapping(path = "/cliente/{id}")
    public ResponseEntity deletarCliente(@Valid @RequestBody Cliente cliente){
        //service = new ClienteService();

        if (service.deletarCliente(cliente)){
            return ResponseEntity.ok().body(cliente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
