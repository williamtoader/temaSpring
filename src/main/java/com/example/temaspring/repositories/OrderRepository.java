package com.example.temaspring.repositories;

import com.example.temaspring.model.ClientOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<ClientOrder, Long> {
    public Iterable<ClientOrder> getClientOrderByCustomer_Id(Long id);
}
