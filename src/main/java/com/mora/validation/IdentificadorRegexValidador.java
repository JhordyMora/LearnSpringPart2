package com.mora.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class IdentificadorRegexValidador implements ConstraintValidator<IdentificadorRegex, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value.matches("^\\d{1,3}\\.\\d{3}\\.\\d{3}-[A-Z]$")) {
            return true;
        }
        return false;
    }

}
