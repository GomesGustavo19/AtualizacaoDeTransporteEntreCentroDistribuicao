package com.atualizacaotransporte.status.validation.validations;


import com.atualizacaotransporte.status.exception.VeiculoException;
import com.atualizacaotransporte.status.validation.constrains.PlacaDeCaminhao;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PlacaDeCaminhaoValidation implements ConstraintValidator<PlacaDeCaminhao,String> {
    @Override
    public void initialize(PlacaDeCaminhao constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        String placa = s;

        if (placa == null) throw new VeiculoException("Placa Invalida");

        return placa.matches("[a-zA-Z]{3}[0-9][A-Za-z0-9]{2}");
    }
}
