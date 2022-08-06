package ru.turaev.address.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.turaev.address.model.Address;
import ru.turaev.address.service.AddressService;

@Slf4j
@RestController
@RequestMapping("api/v1/addresses")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    public Address addAddress(@RequestBody Address address) {
        log.info("Attempt to save a new address in the database");
        Address address1 = addressService.addAddress(address);
        log.info("Address with id {} was created", address1.getId());
        return address1;
    }
}
