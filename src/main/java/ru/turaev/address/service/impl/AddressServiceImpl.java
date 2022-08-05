package ru.turaev.address.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.turaev.address.model.Address;
import ru.turaev.address.repository.AddressRepository;
import ru.turaev.address.service.AddressService;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;

    @Transactional
    @Override
    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }
}
