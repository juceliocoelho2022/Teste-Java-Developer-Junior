package br.com.jucelioCoelho.Teste.Java.Developer.Junior.repository;

import br.com.jucelioCoelho.Teste.Java.Developer.Junior.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxaRepository extends JpaRepository<Cliente, Long> {
}
