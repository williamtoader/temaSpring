package com.example.temaspring.controllers;

import com.example.temaspring.dto.OrderCreateDTO;
import com.example.temaspring.model.ClientOrder;
import com.example.temaspring.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService service;
    @PostMapping("/order")
    public ClientOrder addOrder(OrderCreateDTO dto) {
        return service.addOrder(dto);
    }
}
