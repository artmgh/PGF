package com.pgf.amiksa.task2.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "Address")
@Getter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String country;
    private String city;
    private String street;
    private String postcode;
    private String houseNumber;

    @OneToOne(mappedBy = "address")
    private Client client;

    public Address() {
    }

    public Address(String country, String city, String street, String postcode, String houseNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postcode = postcode;
        this.houseNumber = houseNumber;
    }

    public Address(CreateAddressDto createAddressDto) {
        this.country = createAddressDto.getCountry();
        this.city = createAddressDto.getCity();
        this.street = createAddressDto.getStreet();
        this.postcode = createAddressDto.getPostcode();
        this.houseNumber = createAddressDto.getHouseNumber();
    }

}
