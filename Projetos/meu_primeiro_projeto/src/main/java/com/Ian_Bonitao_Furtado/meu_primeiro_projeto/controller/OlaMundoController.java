package com.Ian_Bonitao_Furtado.meu_primeiro_projeto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/ola-mundo")
public class OlaMundoController {

    @GetMapping
    public String getOlamundo() {
        return "Olá mundo";
    }
    
}