package br.com.jucelioCoelho.Teste.Java.Developer.Junior.controller;

import br.com.jucelioCoelho.Teste.Java.Developer.Junior.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;


}
