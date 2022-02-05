package com.pgf.amiksa.task2.domain;

import com.pgf.amiksa.task2.rest.exception.AddressNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AddressService {


    private final AddressRepository addressRepository;

    public Address getAddress(Long id) {
        return addressRepository.findById(id).orElseThrow(AddressNotFoundException::new);
    }

    public List<Address> getAddresses() {
        return addressRepository.findAll();
    }
}
