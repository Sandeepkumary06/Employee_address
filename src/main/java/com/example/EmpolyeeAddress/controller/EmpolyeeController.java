package com.example.EmpolyeeAddress.controller;


import com.example.EmpolyeeAddress.model.Empolyee;
import com.example.EmpolyeeAddress.service.EmpolyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmpolyeeController {
    @Autowired
    EmpolyeeService employeeService;


    @GetMapping("/")
    public Iterable<Empolyee> getAll(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/{id}")
    public Empolyee getById(@PathVariable Long id){
        return employeeService.getById(id);
    }

    @PostMapping("/")
    public String postEmployeeList(@RequestBody List<Empolyee> list){
        return employeeService.addList(list);
    }

    @PutMapping("/{id}")
    public String updateById(@PathVariable Long id, @RequestBody Empolyee employee){
        return employeeService.updateById(id, employee);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        employeeService.deleteById(id);
    }
}
