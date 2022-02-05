package com.pgf.amiksa.task2.domain;

import com.pgf.amiksa.task2.rest.exception.ClientNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public Client getClient(Long id) {
        return clientRepository.findById(id).orElseThrow(ClientNotFoundException::new);
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Client createClient(ClientDto clientDto) {
        clientDto.getEmail();
        return null;
    }
}
