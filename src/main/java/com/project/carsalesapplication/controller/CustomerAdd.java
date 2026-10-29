package com.project.carsalesapplication.controller;

import com.project.carsalesapplication.entity.CustomerDetails;
import com.project.carsalesapplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerAdd {

    private final CustomerService customerService;
    @Autowired
    public CustomerAdd(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> searchByCustomerId(@PathVariable("id") Integer integer){
                  CustomerDetails customerDetails = customerService.searchById(integer);
           return ResponseEntity.status(HttpStatus.OK).body(customerDetails);
    }
    @GetMapping("/get")
    public ResponseEntity<List<CustomerDetails>> customerDetailsResponseEntity(){
        List<CustomerDetails> customerDetails = customerService.getAllCustomerDetails();
        return ResponseEntity.status(200).body(customerDetails);
    }
    @PostMapping("/add")
    public ResponseEntity<CustomerDetails> addCustomer(@RequestBody CustomerDetails customerDetails){
        CustomerDetails customerDetails1 = customerService.saveCustomer(customerDetails);
        return ResponseEntity.status(201).body(customerDetails1);
    }
}
