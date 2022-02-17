package com.mercans.interview.config;

import com.mercans.interview.exception.InvalidNumberException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(InvalidNumberException.class)
    public ResponseEntity<String> handleValidInput(InvalidNumberException ex){
        String message = ex.getMessage();
        return ResponseEntity.badRequest().body(message);
    }
}
