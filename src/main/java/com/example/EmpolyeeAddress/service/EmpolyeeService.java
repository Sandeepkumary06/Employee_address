package com.example.EmpolyeeAddress.service;

import com.example.EmpolyeeAddress.model.Empolyee;
import com.example.EmpolyeeAddress.respository.IEmpolyeeRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpolyeeService {
    @Autowired
    IEmpolyeeRepo employeeRepository;

    public Iterable<Empolyee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Empolyee getById(Long id) {
        return employeeRepository.findById(id).get();
    }


    public String addList(List<Empolyee> list) {
        Iterable<Empolyee> listOfEmployee =  employeeRepository.saveAll(list);
        if(listOfEmployee != null) return "List added successfully.";
        return "Could not added";
    }

    @Transactional
    public String updateById(Long id, Empolyee employee) {
        /*Employee employee1 = employeeRepository.findById(id).get();
        employee1.setFirstName(employee.getFirstName());
        employee1.getAddress().setCity(employee.getAddress().getCity());
        employee1.getAddress().setState(employee.getAddress().getState());
        employee1.getAddress().setStreet(employee.getAddress().getStreet());
        employee1.getAddress().setZipcode(employee.getAddress().getZipcode());
        employee1.setLastName(employee.getLastName());*/

        employeeRepository.save(employee);
        return "Employee with id " + id + " updated";
    }

    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
