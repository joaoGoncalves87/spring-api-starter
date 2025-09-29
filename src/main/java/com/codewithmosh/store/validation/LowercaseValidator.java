package com.codewithmosh.store.validation;

import com.codewithmosh.store.annotations.Lowercase;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class LowercaseValidator implements ConstraintValidator<Lowercase, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return value.trim().toLowerCase().equals(value.trim());
    }
}
