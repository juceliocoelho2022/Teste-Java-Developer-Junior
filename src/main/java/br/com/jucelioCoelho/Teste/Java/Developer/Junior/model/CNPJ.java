package br.com.jucelioCoelho.Teste.Java.Developer.Junior.model;

import br.com.jucelioCoelho.Teste.Java.Developer.Junior.validation.ValidadorCNPJ;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidadorCNPJ.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CNPJ {
    String message() default "CNPJ inválido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
