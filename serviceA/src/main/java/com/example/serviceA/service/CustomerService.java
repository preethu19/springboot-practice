package com.example.serviceA.service;

import org.springframework.stereotype.Service;

import java.util.List;

import com.example.serviceA.model.Customer;
import com.example.serviceA.repository.CustomerRepository;


@Service
public class CustomerService{
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer getCustomer(String id){
        return customerRepository.findById(id).orElse(null);
    }

    public Customer create(Customer customer){
        return customerRepository.save(customer);
    }

    public void delete(String id){
        customerRepository.deleteById(id);
    }

    public Customer update(Customer customer, String id){
        Customer customer1 = customerRepository.findById(id).get();
        customer1.setName(customer.getName());
        customerRepository.save(customer1);
        return customer1;
    }

    public void deleteAll(){
        customerRepository.deleteAll();
    }
}