package com.example.EmpolyeeAddress.service;

import com.example.EmpolyeeAddress.model.Address;
import com.example.EmpolyeeAddress.respository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepository;

    public Iterable<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    public Address getById(Long id) {
        return addressRepository.findById(id).get();
    }

    public String addList(List<Address> list) {
        addressRepository.saveAll(list);
        return "Address List Added";
    }

    public String updateById(Long id, Address address) {
        addressRepository.save(address);
        return "Address Update";
    }

    public void deleteById(Long id) {
        addressRepository.deleteById(id);

    }
}
