package com.pgf.amiksa.task2.rest;

import com.pgf.amiksa.task2.domain.*;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class RestTest {

    private final ClientService clientService;
    private final AddressService addressService;

    @GetMapping(path = "clients/{id}")
    public ResponseEntity<Client> getClient(@PathVariable Long id) {
        return ResponseEntity.ok(clientService.getClient(id));
    }

    @GetMapping(path = "clients")
    public ResponseEntity<List<Client>> getClients() {
        return ResponseEntity.ok(clientService.getClients());
    }

    @GetMapping(path = "addresses/{id}")
    public ResponseEntity<Address> getAddress(@PathVariable Long id) {
        return ResponseEntity.ok(addressService.getAddress(id));
    }

    @GetMapping(path = "addresses")
    public ResponseEntity<List<Address>> getAddresses() {
        return ResponseEntity.ok(addressService.getAddresses());
    }

    @PostMapping(path= "clients")
    public ResponseEntity<Object> createClient(@RequestBody ClientDto clientDto){
        return ResponseEntity.ok(clientService.createClient(clientDto));
    }


}
