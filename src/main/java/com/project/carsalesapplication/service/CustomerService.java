package com.project.carsalesapplication.service;

import com.project.carsalesapplication.entity.CustomerDetails;
import com.project.carsalesapplication.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerDetails searchById(Integer integer) {
        return customerRepository.findById(integer).orElseThrow(()->new RuntimeException("Not Found Exception"));
    }

    public CustomerDetails saveCustomer(CustomerDetails customerDetails) {
        return customerRepository.save(customerDetails);
    }

    public List<CustomerDetails> getAllCustomerDetails() {
        return customerRepository.findAll();
    }
}
