package com.pgf.amiksa.task2;

import com.pgf.amiksa.task2.domain.Address;
import com.pgf.amiksa.task2.domain.AddressRepository;
import com.pgf.amiksa.task2.domain.Client;
import com.pgf.amiksa.task2.domain.ClientRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Task2Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Task2Application.class, args);

        ClientRepository clientRepository = configurableApplicationContext.getBean(ClientRepository.class);
        AddressRepository addressRepository = configurableApplicationContext.getBean(AddressRepository.class);

        Address address = new Address("pl", "ldz", "ulica", "23232", "12");
        addressRepository.save(address);
        Client client = new Client("Jan", "mail@gm.com");
        client.setAddress(address);
        clientRepository.save(client);


        Address address2 = new Address("pl", "wwa", "ulica", "23232", "12");
        addressRepository.save(address2);

        client.setAddress(address2);
        clientRepository.save(client);


    }

}
