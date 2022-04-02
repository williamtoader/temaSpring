package com.example.temaspring.services;

import com.example.temaspring.dto.OrderDTO;
import com.example.temaspring.model.ClientOrder;
import com.example.temaspring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepository repository;

    @Autowired
    CustomerService customerService;

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

    public ClientOrder saveOrder(OrderDTO dto) {
        return repository.save(new ClientOrder(dto.id, dto.orderText, customerService.getCustomerById(dto.customerId)));
    }

    public Iterable<ClientOrder> getAllOrdersForCustomerId(Long customerId) {
        return repository.getClientOrderByCustomer_Id(customerId);
    }
}
