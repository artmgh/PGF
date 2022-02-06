package com.pgf.amiksa.task2.domain;

import com.pgf.amiksa.task2.rest.exception.IncorrectEmailAddressException;
import com.pgf.amiksa.task2.utils.MailValidator;
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
    private Long id;
    private String name;
    private String email;
    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    public Client() {
    }

    public Client(String name, String email) {
        this.name = name;
        this.email = validEmail(email);
    }

    private String validEmail(String email) {
        if (MailValidator.patternMatches(email)) {
            return email;
        } else {
            throw new IncorrectEmailAddressException();
        }
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
