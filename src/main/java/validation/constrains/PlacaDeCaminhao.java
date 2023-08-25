package validation.constrains;

import jakarta.validation.Constraint;
import validation.validations.PlacaDeCaminhaoValidation;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PlacaDeCaminhaoValidation.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PlacaDeCaminhao {

    String message() default "Placa Invalida";

    Class<?>[] groups() default {};

    Class<? extends jakarta.validation.Payload>[] payload() default {};
}
