package br.com.jucelioCoelho.Teste.Java.Developer.Junior.repository;

import br.com.jucelioCoelho.Teste.Java.Developer.Junior.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
