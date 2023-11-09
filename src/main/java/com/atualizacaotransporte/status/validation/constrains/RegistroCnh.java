package com.atualizacaotransporte.status.validation.constrains;

import com.atualizacaotransporte.status.validation.validations.RegistroCnhValidation;
import jakarta.validation.Constraint;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = RegistroCnhValidation.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RegistroCnh {

    String message() default "Digite um registro valida";

    Class<?>[] groups() default {};

    Class<? extends jakarta.validation.Payload>[] payload() default {};
}
