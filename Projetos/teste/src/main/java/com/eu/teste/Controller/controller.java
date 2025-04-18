package com.eu.teste.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class controller {

    @GetMapping("/bemVindo")
    public String bemVindo () {
        return "Bem Vindo";
    }

    @GetMapping("/corinthians")
    public String getTimao() {
        return "Vai Corinthians!!!";
     
    }

    @GetMapping("/teste")
    public String getTeste() {
        return "Isso é um teste";
    }
    
    
}
