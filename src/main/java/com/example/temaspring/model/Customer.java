package com.example.temaspring.model;

import com.example.temaspring.dto.CustomerDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.Set;
import org.springframework.data.domain.Sort;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    public Customer(CustomerDTO dto) {
        this.id = dto.getId();
        this.name = dto.getName();
    }

    @NotNull
    @GeneratedValue
    @Id
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @NotNull
    private String name;

    @OneToMany
    public List<ClientOrder> clientOrders;
}
