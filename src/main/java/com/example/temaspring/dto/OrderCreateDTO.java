package com.example.temaspring.dto;

import com.example.temaspring.model.ClientOrder;
import com.example.temaspring.model.OrderDetails;
import com.example.temaspring.services.CustomerService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderCreateDTO {

    public String orderText;
    public Long customerId;

}
