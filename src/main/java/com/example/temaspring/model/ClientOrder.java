package com.example.temaspring.model;

import com.example.temaspring.services.CustomerService;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class ClientOrder {

    public ClientOrder(String orderText, Customer customer) {
        this.orderText = orderText;
        this.customer = customer;
    }

    @NotNull
    @GeneratedValue
    @Id
    private Long id;


    private String orderText;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "customer_id")
    public Customer customer;
}
