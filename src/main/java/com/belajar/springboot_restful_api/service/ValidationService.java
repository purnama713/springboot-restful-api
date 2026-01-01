package com.belajar.springboot_restful_api.service;

import com.belajar.springboot_restful_api.model.RegisterUserRequest;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

// Dimanapun service yang butuh validasi, maka tinggal pake ValidationService

@Service
public class ValidationService {

    @Autowired
    private Validator validator;

    public void validate(Object request) {
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(request);
        if (!constraintViolations.isEmpty()) {
            // error
            throw new ConstraintViolationException(constraintViolations);
        }
    }
}
