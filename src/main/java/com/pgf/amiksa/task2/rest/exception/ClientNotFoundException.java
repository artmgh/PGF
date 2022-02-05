package com.pgf.amiksa.task2.rest.exception;

public class ClientNotFoundException extends RuntimeException {

    public ClientNotFoundException() {
        super("Client not found");
    }

}
