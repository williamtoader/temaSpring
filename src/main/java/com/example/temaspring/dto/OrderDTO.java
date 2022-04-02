package com.example.temaspring.dto;

import com.example.temaspring.model.ClientOrder;
import com.example.temaspring.model.OrderDetails;
import com.example.temaspring.services.CustomerService;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    @JsonProperty(access = JsonProperty.Access.AUTO)
    public Long id;
    public String orderText;
    public Long customerId;

}
