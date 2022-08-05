package ru.turaev.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.turaev.address.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
