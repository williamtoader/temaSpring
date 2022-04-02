package com.example.temaspring.repositories;

import com.example.temaspring.model.OrderDetails;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Long> {
    Iterable<OrderDetails> findAllByClientOrder_Id(Long id);
}
