package com.pgf.amiksa.task2.rest;

import com.pgf.amiksa.task2.domain.*;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clients")
@AllArgsConstructor
public class PGFRestApi {

    private final ClientServiceImpl clientService;

    @Operation(description = "Get all clients")
    @GetMapping
    public ResponseEntity<List<ClientDto>> getClients() {
        List<Client> clients = clientService.getClients();
        List<ClientDto> clientDtos = clients.stream().map(ClientDto::new).collect(Collectors.toList());
        return ResponseEntity.ok(clientDtos);
    }

    @Operation(description = "Create new client")
    @PostMapping
    public ResponseEntity<ClientDto> createClient(@RequestBody CreateClientDto createClientDto) {
        Client client = clientService.createClient(createClientDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ClientDto(client));
    }

    @Operation(description = "Get client by Id")
    @GetMapping("/{id}")
    public ResponseEntity<ClientDto> getClient(@PathVariable Long id) {
        Client client = clientService.getClient(id);
        return ResponseEntity.ok(new ClientDto(client));
    }

    @Operation(description = "Add new address to client")
    @PostMapping("/{id}/address")
    public ResponseEntity<ClientDto> createAddressForClient(
            @PathVariable Long id,
            @RequestBody CreateAddressDto createAddressDto) {
        Client client = clientService.createAddressForClient(id, createAddressDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ClientDto(client));
    }
}
