package com.example.temaspring.controllers;

import com.example.temaspring.dto.CustomerDTO;
import com.example.temaspring.model.Customer;
import com.example.temaspring.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    @Autowired
    CustomerService service;

    @PutMapping("/customer")
    public Customer createCustomer(@RequestBody CustomerDTO dto) {
        return service.saveCustomer(dto);
    }

    @GetMapping("/customer")
    public Customer getCustomerById(@RequestParam Long id){
        return service.getCustomerById(id);
    }

    @GetMapping("/customers")
    public Iterable<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }

    @DeleteMapping("/customer")
    public void deleteCustomerById(@RequestParam Long id){
        service.deleteCustomerById(id);
    }
}
