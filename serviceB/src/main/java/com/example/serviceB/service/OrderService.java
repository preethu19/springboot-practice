package com.example.serviceB.service;

import org.springframework.stereotype.Service;

import java.util.List;

import com.example.serviceB.model.Orders;
import com.example.serviceB.repository.OrderRepository;


@Service
public class OrderService{
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public List<Orders> getAllOrders(){
        return orderRepository.findAll();
    }

    public Orders getOrder(String id){
        return orderRepository.findById(id).orElse(null);
    }

    public Orders create(Orders order){
        return orderRepository.save(order);
    }

    public void delete(String id){
        orderRepository.deleteById(id);
    }

    public Orders update(Orders order, String id){
        Orders order1 = orderRepository.findById(id).get();
        order1.setCustomerid(order.getCustomerid());
        order1.setName(order.getName());
        orderRepository.save(order1);
        return order1;
    }

    public void deleteAll(){
        orderRepository.deleteAll();
    }

    public List<Orders> getByCustomerid(String id){
        return orderRepository.findByCustomerId(id);
    }
}