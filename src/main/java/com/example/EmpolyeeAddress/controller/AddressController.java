package com.example.EmpolyeeAddress.controller;


import com.example.EmpolyeeAddress.model.Address;
import com.example.EmpolyeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addressService;


    @GetMapping("/")
    public Iterable<Address> getAll(){
        return addressService.getAllAddress();
    }

    @GetMapping("/{id}")
    public Address getById(@PathVariable Long id){
        return addressService.getById(id);
    }

    @PostMapping("/")
    public String postAddressList(@RequestBody List<Address> list){
        return addressService.addList(list);
    }

    @PutMapping("/{id}")
    public String updateById(@PathVariable Long id, @RequestBody Address address){
        return addressService.updateById(id, address);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        addressService.deleteById(id);
    }

}
