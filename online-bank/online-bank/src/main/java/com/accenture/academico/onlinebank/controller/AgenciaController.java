package com.accenture.academico.onlinebank.controller;

import com.accenture.academico.onlinebank.model.Agencia;
import com.accenture.academico.onlinebank.service.AgenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AgenciaController {

    @Autowired
    private AgenciaService service;

    @PostMapping(path = "/agencia")
    public Agencia cadastraCliente(@Valid @RequestBody Agencia agencia) {
        return service.cadastraAgencia(agencia);
    }

    @GetMapping(path = "agencias")
    public List<Agencia> consultaAgencias() {
        return service.consultaAgencias();
    }

    @GetMapping(path = "/agencias/{id}")
    public ResponseEntity consultaAgencia(@PathVariable Integer id) {
        return service.consultarAgencia(id);
    }

    @PostMapping(path = "/agencias/{id}")
    public ResponseEntity deletarAgencia(@Valid @RequestBody Agencia agencia){
        if (service.deletarAgencia(agencia)){
            return ResponseEntity.ok().body(agencia);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
