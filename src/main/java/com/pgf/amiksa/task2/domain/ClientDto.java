package com.pgf.amiksa.task2.domain;

import lombok.Value;

@Value
public class ClientDto {

  Long id;
  String name;
  String email;
  AddressDto address;

  public ClientDto(Client client) {
    id = client.getId();
    name = client.getName();
    email = client.getEmail();
    address = client.getAddress() != null ? new AddressDto(client.getAddress()) : null;
  }
}
