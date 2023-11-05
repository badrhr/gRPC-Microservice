package com.customer.service.customerservice;

import com.customer.service.customerservice.entities.Customer;
import com.customer.service.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableJpaRepositories(basePackages="com.customer.repository")
//@EntityScan(basePackages="com.customer.entities")
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("x").email("x@gmail.com").build());
            customerRepository.save(Customer.builder().name("y").email("y@gmail.com").build());
            customerRepository.save(Customer.builder().name("z").email("z@gmail.com").build());
        };
    }
}
