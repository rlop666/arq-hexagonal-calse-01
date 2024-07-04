package com.example.hexagonal.domain.repository;

import com.example.hexagonal.domain.entity.Order;
import java.util.List;
import java.util.Optional;
import java.lang.Long;

public interface OrderRepository {
    Order save(Order order);
    List<Order> findAll();
    Optional<Order> findById(Long id);
    void deleteById(Long id);
}