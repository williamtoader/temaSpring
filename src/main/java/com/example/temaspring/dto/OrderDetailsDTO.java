package com.example.temaspring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailsDTO {
    @JsonProperty(access = JsonProperty.Access.AUTO)
    Long id;

    Long orderId;

    @JsonProperty(access = JsonProperty.Access.AUTO)
    Double price;
    @JsonProperty(access = JsonProperty.Access.AUTO)
    Integer quantity;
}
