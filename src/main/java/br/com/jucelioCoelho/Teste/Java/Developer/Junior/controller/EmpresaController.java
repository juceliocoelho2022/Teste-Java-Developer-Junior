package br.com.jucelioCoelho.Teste.Java.Developer.Junior.controller;

import br.com.jucelioCoelho.Teste.Java.Developer.Junior.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
    @Autowired
    private EmpresaRepository empresaRepository;


}
