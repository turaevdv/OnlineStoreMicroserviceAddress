package ru.turaev.address.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.turaev.address.model.Address;
import ru.turaev.address.service.AddressService;

@Slf4j
@RestController
@RequestMapping("api/v1/addresses")
@RequiredArgsConstructor
public class AddressController {
    private final AddressService addressService;

    @PostMapping
    public Address addAddress(@RequestBody Address address) {
        log.info("Attempt to save a new address in the database");
        Address address1 = addressService.addAddress(address);
        log.info("Address with id {} was created", address1.getId());
        return address1;
    }

    @GetMapping("/exist/{id}")
    public boolean isAddressExist(@PathVariable long id) {
        return addressService.isAddressExist(id);
    }
}
