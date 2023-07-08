package com.example.EmpolyeeAddress.respository;

import com.example.EmpolyeeAddress.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Long> {
}
