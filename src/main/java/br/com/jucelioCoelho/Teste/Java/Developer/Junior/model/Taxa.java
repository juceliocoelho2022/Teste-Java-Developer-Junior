package br.com.jucelioCoelho.Teste.Java.Developer.Junior.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Taxa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double saldo;
    private String nome;
    private double valor;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

}

