package com.example.demo.service.impl;

import com.example.demo.entity.Customer;
import com.example.demo.payload.request.CustomerRequest;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository repository;

    @Override
    public ResponseEntity getAllCustomers() {
        return null;
    }

    @Override
    public ResponseEntity getCustomerById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity deleteCustomer(Long id) {
        return null;
    }

    @Override
    public ResponseEntity addCustomer(CustomerRequest customerRequest) {
        ModelMapper mapper = new ModelMapper();
        Customer entity = mapper.map(customerRequest, Customer.class);
        Customer save = repository.save(entity);
        return new ResponseEntity<>(save, HttpStatus.OK);
    }
}
