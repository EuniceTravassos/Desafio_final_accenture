package com.accenture.academico.onlinebank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo")
public class StatusController {

    @GetMapping("/baar")
    public String valida() {
        return "ONLINE";
    }
}
