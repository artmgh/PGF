package com.pgf.amiksa.task2.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Client")
@ToString
@Getter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter(AccessLevel.NONE)
    private Long id;
    private String name;
    private String email;
    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    public Client() {
    }

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
