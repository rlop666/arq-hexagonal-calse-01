package com.example.hexagonal.domain.repository;

import com.example.hexagonal.domain.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    Customer save(Customer customer);
    List<Customer> findAll();
    Optional<Customer> findById(Long id);
    void deleteById(Long id);
}
