package br.com.jucelioCoelho.Teste.Java.Developer.Junior.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ExemploService {

    private static final Logger logger = LoggerFactory.getLogger(ExemploService.class);

    public void fazerAlgo() {
        logger.info("Exemplo de log INFO");
        logger.error("Exemplo de log ERROR");
    }
}
