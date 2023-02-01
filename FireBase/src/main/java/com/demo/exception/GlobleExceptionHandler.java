package com.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobleExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<?> excptionHandler(UserNotFoundException ex) {

        return new ResponseEntity<String> (ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
