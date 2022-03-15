package com.workshop.usermanagement.controller;

import com.workshop.usermanagement.exception.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserManagementExceptionHandler {
    @ExceptionHandler(EntityNotFoundException.class)
    protected ResponseEntity<ExceptionResponse> handleConflict(EntityNotFoundException ex) {
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.setErrorCode("1001");
        exceptionResponse.setErrorMessage(ex.getMessage());

        return ResponseEntity.ok().body(exceptionResponse);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    protected ResponseEntity<ExceptionResponse> handleConflict(IllegalArgumentException ex) {
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.setErrorCode("1001");
        exceptionResponse.setErrorMessage(ex.getMessage());

        return ResponseEntity.ok().body(exceptionResponse);
    }

}
