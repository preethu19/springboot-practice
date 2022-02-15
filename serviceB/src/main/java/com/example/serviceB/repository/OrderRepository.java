package com.example.serviceB.repository;

import com.example.serviceB.model.Orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Orders, String>{
    public List<Orders> findByCustomerId(String customerId);
}