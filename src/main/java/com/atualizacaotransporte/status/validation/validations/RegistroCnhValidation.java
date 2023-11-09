package com.atualizacaotransporte.status.validation.validations;

import com.atualizacaotransporte.status.exception.CondutorException;
import com.atualizacaotransporte.status.validation.constrains.RegistroCnh;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RegistroCnhValidation implements ConstraintValidator<RegistroCnh, String> {


    @Override
    public void initialize(RegistroCnh constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        String registro = s;
        if (s == null)
            throw new CondutorException("Digite um registro valido");
        return s.matches("[0-9]{12}");
    }
}
