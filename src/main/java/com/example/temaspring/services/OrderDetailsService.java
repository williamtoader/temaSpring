package com.example.temaspring.services;

import com.example.temaspring.dto.OrderDetailsDTO;
import com.example.temaspring.model.ClientOrder;
import com.example.temaspring.model.OrderDetails;
import com.example.temaspring.repositories.OrderDetailsRepository;
import com.example.temaspring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderDetailsService {
    @Autowired
    OrderDetailsRepository repository;

    @Autowired
    OrderRepository orderRepository;

    public OrderDetails saveOrderDetails(OrderDetailsDTO dto) {
        Optional<ClientOrder> orderOptional = orderRepository.findById(dto.getOrderId());
        if(orderOptional.isPresent()) {
            OrderDetails orderDetails = new OrderDetails(dto);
            orderDetails.setClientOrder(orderOptional.get());
            return repository.save(orderDetails);
        }
        return null;
    }

    public Iterable<OrderDetails> getAllOrderDetails() {
        return repository.findAll();
    }

    public Iterable<OrderDetails> getOrderDetails(Long orderId) {
        return repository.findAllByClientOrder_Id(orderId);
    }

    public void deleteOrderDetails(Long id) {
        repository.deleteById(id);
    }
}
