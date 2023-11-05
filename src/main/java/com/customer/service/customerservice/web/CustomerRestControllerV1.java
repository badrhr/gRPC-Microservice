package com.customer.service.customerservice.web;

import com.customer.service.customerservice.entities.Customer;
import com.customer.service.customerservice.repository.CustomerRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CustomerRestControllerV1 {

    private CustomerRepository customerRepository;


    public List<Customer> customerList(){
        return customerRepository.findAll();
    }


    public Customer customerById( Long id){
        return customerRepository.findById(id).get();
    }


    public Customer saveCustomer( Customer customer){
        customerRepository.save(customer);
        return customer;
    }
}