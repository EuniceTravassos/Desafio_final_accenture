package com.accenture.academico.onlinebank.controller;

import com.accenture.academico.onlinebank.repository.*;
import com.accenture.academico.onlinebank.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteController controller;

    @GetMapping(path = "/cliente/{id}")
    public ResponseEntity consultaClientes(@PathVariable Integer id) {
        return ((Object) controller.findById(id))
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    private Object findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@PostMapping(path = "/cliente")
    public Cliente cadastraCliente(@Valid @RequestBody Cliente cliente) {
        return controller.save(cliente);
    }

    private Cliente save(@Valid Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping(path = "clientes")
    public List<Cliente> consultaClientes() {
        return (List<Cliente>) controller.findAll();
    }

    private List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@PostMapping(path = "/cliente/{id}")
    public void deletarCliente(@Valid @RequestBody Cliente cliente){
        controller.delete(cliente);
    }

	private void delete(@Valid Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

}