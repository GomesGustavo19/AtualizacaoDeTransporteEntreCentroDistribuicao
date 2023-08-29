package com.atualizacaotransporte.status.validation.validations;


import com.atualizacaotransporte.status.validation.constrains.PlacaCarro;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PlacaDeCaminhaoValidation implements ConstraintValidator<PlacaCarro, String> {
    @Override
    public void initialize(PlacaCarro constraintAnnotation) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        String placa = s == null ? " " : s;
        return placa.matches("[A-Z]{3}[0-9][0-9A-Z][0-9]{2}");
    }
}
