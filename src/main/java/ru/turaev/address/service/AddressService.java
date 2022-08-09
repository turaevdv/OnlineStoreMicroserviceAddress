package ru.turaev.address.service;

import ru.turaev.address.model.Address;

public interface AddressService {
    boolean isAddressExist(long id);
    Address addAddress(Address address);
}
