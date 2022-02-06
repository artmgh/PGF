package com.pgf.amiksa.task2.domain;

import com.pgf.amiksa.task2.rest.exception.ClientNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImpl {

    private final ClientRepository clientRepository;
    private final AddressRepository addressRepository;

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Client getClient(Long id) {
        return clientRepository.findById(id).orElseThrow(ClientNotFoundException::new);
    }

    public Client createClient(CreateClientDto createClientDto) {
        Client client = new Client(createClientDto.getName(), createClientDto.getEmail());
        return clientRepository.save(client);
    }

    public Client createAddressForClient(Long id, CreateAddressDto createAddressDto) {
        Client client = clientRepository.findById(id).orElseThrow(ClientNotFoundException::new);
        Address address = new Address(createAddressDto);
        addressRepository.save(address);
        client.setAddress(address);
        return clientRepository.save(client);
    }
}
