package com.pgf.amiksa.task2.rest.exception;

public class IncorrectEmailAddressException extends RuntimeException {
    public IncorrectEmailAddressException() {
        super("Incorrect email address");
    }
}
