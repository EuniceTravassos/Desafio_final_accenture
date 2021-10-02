package com.accenture.academico.onlinebank.validations;

import com.accenture.academico.onlinebank.model.Cliente;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ClienteValidation implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Cliente.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "clienteNome", "clienteNome.empty");
    }
}
