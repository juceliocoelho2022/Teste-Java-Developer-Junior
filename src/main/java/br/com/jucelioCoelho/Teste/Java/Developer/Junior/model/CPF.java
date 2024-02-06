package br.com.jucelioCoelho.Teste.Java.Developer.Junior.model;

import br.com.jucelioCoelho.Teste.Java.Developer.Junior.validation.ValidadorCPF;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidadorCPF.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CPF {
    String message() default "CPF inválido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

