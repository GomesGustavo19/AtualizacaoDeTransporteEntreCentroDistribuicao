package com.atualizacaotransporte.status.validation.constrains;

import jakarta.validation.Constraint;
import com.atualizacaotransporte.status.validation.validations.PlacaDeCaminhaoValidation;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PlacaDeCaminhaoValidation.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PlacaCarro {

    String message() default "Digite uma placa valida";

    Class<?>[] groups() default {};

    Class<? extends jakarta.validation.Payload>[] payload() default {};
}
