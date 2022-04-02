package com.example.temaspring.model;

import com.example.temaspring.dto.OrderDetailsDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails {
    public OrderDetails(OrderDetailsDTO dto) {
        this.id = dto.getId();
        this.orderId = dto.getOrderId();
        this.price = dto.getPrice();
        this.quantity = dto.getQuantity();
    }

    @Id
    @NotNull
    @GeneratedValue
    private Long id;

    private Long orderId;

    Double price;
    Integer quantity;


    @ManyToOne
    @JoinColumn(name = "orderId", referencedColumnName = "id")
    ClientOrder clientOrder;
}
