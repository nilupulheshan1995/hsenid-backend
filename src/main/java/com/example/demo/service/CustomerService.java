package com.example.demo.service;

import com.example.demo.payload.request.CustomerRequest;
import org.springframework.http.ResponseEntity;

public interface CustomerService {
    ResponseEntity getAllCustomers();
    ResponseEntity getCustomerById(Long id);
    ResponseEntity deleteCustomer(Long id);
    ResponseEntity addCustomer(CustomerRequest request);
}
