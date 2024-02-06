package br.com.jucelioCoelho.Teste.Java.Developer.Junior.controller;

import br.com.jucelioCoelho.Teste.Java.Developer.Junior.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;



}
