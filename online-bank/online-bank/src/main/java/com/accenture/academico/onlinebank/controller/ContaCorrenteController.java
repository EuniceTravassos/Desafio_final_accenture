package com.accenture.academico.onlinebank.controller;

import com.accenture.academico.onlinebank.model.Cliente;
import com.accenture.academico.onlinebank.model.ContaCorrente;
import com.accenture.academico.onlinebank.service.ContaCorrenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class ContaCorrenteController {

    @Autowired
    private ContaCorrenteService service;

    @PostMapping(path = "/conta")
    public Cliente sacarDepositar(@Valid @RequestBody Cliente cliente) {

        if(service.saque(cliente)) {
            return cliente;
        } else {
            return cliente;
        }
    }

}
