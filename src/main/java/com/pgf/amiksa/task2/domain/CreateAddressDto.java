package com.pgf.amiksa.task2.domain;

import lombok.Value;

@Value
public class CreateAddressDto {

  String country;
  String city;
  String street;
  String postcode;
  String houseNumber;
}
