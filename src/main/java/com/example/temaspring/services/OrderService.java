package com.example.temaspring.services;

import com.example.temaspring.dto.OrderCreateDTO;
import com.example.temaspring.model.ClientOrder;
import com.example.temaspring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository repository;

    public Iterable<ClientOrder> getAllOrders() {
        return repository.findAll();
    }

    public ClientOrder getOrderById(Long id) {
        return repository.findById(id).get();
    }

    public void deleteOrderById(Long id) {
        repository.deleteById(id);
    }

    public void updateOrder(ClientOrder order) {
        repository.save(order);
    }

    public ClientOrder addOrder(OrderCreateDTO dto) {
        return repository.save(dto.createOrderObject());
    }

    public List<ClientOrder> getAllOrdersForCustomerId(Long customerId) {
        return repository.getAllByCustomer_Id(customerId);
    }
}
