package com.example.temaspring.controllers;

import com.example.temaspring.dto.OrderCreateDTO;
import com.example.temaspring.model.ClientOrder;
import com.example.temaspring.services.OrderService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService service;
    @PutMapping("/order")
    public ClientOrder addOrder(@RequestBody OrderCreateDTO dto) {
        return service.addOrder(dto);
    }

    @PutMapping("/order/update")
    public ClientOrder updateOrder(@NotNull @RequestParam Long id, @RequestBody OrderCreateDTO dto) {
        return service.updateOrder(id, dto);
    }

    @GetMapping("/order")
    public ClientOrder getOrderById(@RequestParam Long id) {
        return service.getOrderById(id);
    }

    @GetMapping("/ordersFor")
    public Iterable<ClientOrder> getAllOrderByCustomer(@NotNull @RequestParam Long customerId) {
        return service.getAllOrdersForCustomerId(customerId);
    }

    @GetMapping("/orders")
    public Iterable<ClientOrder> getAllOrders() {
        return service.getAllOrders();
    }

    @DeleteMapping("/order")
    public void deleteOrderById(@RequestParam Long id) {
        service.deleteOrderById(id);
    }
}
