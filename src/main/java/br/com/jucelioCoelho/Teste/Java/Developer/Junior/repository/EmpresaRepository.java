package br.com.jucelioCoelho.Teste.Java.Developer.Junior.repository;

import br.com.jucelioCoelho.Teste.Java.Developer.Junior.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
