package com.pgf.amiksa.task2.rest.exception;

public class AddressNotFoundException extends RuntimeException {
    public AddressNotFoundException() {
        super("Address not found");
    }
}
