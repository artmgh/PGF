package com.pgf.amiksa.task2.domain;

import lombok.Value;

@Value
public class AddressDto {

  String country;
  String city;
  String street;
  String postcode;
  String houseNumber;

  AddressDto(Address address) {
    country = address.getCountry();
    city = address.getCity();
    street = address.getStreet();
    postcode = address.getPostcode();
    houseNumber = address.getHouseNumber();
  }
}
