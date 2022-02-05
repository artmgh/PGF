package com.pgf.amiksa.task2.domain;

import lombok.Value;

@Value
public class ClientDto {

    private String name;
    private String email;
    private Address address;

}
