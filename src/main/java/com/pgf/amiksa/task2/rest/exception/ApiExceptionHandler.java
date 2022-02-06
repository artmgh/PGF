package com.pgf.amiksa.task2.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({AddressNotFoundException.class, ClientNotFoundException.class})
    public ResponseEntity<ApiError> handleNotFoundException(Exception e) {
        HttpStatus notFoundHttpStatus = HttpStatus.NOT_FOUND;
        return ResponseEntity.status(notFoundHttpStatus).body(new ApiError(e.getMessage(), notFoundHttpStatus.toString()));
    }

    @ExceptionHandler(IncorrectEmailAddressException.class)
    public ResponseEntity<ApiError> handleIncorrectData(Exception e) {
        HttpStatus notFoundHttpStatus = HttpStatus.BAD_REQUEST;
        return ResponseEntity.status(notFoundHttpStatus).body(new ApiError(e.getMessage(), notFoundHttpStatus.toString()));
    }
}
