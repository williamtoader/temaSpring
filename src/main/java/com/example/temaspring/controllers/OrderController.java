package com.example.temaspring.controllers;

import com.example.temaspring.dto.OrderDTO;
import com.example.temaspring.model.ClientOrder;
import com.example.temaspring.model.OrderDetails;
import com.example.temaspring.services.OrderDetailsService;
import com.example.temaspring.services.OrderService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderService service;

    @Autowired
    OrderDetailsService detailsService;

    @PutMapping("/order")
    public ClientOrder saveOrder(@RequestBody OrderDTO dto) {
        return service.saveOrder(dto);
    }

    @GetMapping("/order")
    public ClientOrder getOrderById(@RequestParam Long id) {
        return service.getOrderById(id);
    }

    @GetMapping("/orders")
    public Iterable<ClientOrder> getAllOrderByCustomer(@Nullable @RequestParam Long customerId) {
        if(customerId == null) return service.getAllOrders();
        return service.getAllOrdersForCustomerId(customerId);
    }

    @DeleteMapping("/order")
    public void deleteOrderById(@RequestParam Long id) {
        service.deleteOrderById(id);
    }

    @GetMapping("/order/products")
    public Iterable<OrderDetails> getOrderDetails(@RequestParam Long id){
        return detailsService.getOrderDetails(id);
    }
}
