package com.example.temaspring.services;

import com.example.temaspring.dto.CustomerDTO;
import com.example.temaspring.model.Customer;
import com.example.temaspring.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository repository;

    public Iterable<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return repository.findById(id).get();
    }

    public void deleteCustomerById(Long id) {
        repository.deleteById(id);
    }

    public Customer saveCustomer(CustomerDTO dto) {
        return repository.save(new Customer(dto));
    }
}
