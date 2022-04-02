package com.example.temaspring.dto;

import com.example.temaspring.model.Customer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class CustomerDTO {
    @JsonProperty(access = JsonProperty.Access.AUTO)
    Long id;

    @NotNull
    String name;
}
