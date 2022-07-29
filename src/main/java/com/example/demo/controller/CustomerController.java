package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/customer")
public class CustomerController {

    @GetMapping(path = "/getAll")               // api/customer/getAll
    public String getCustomers() {
        //TODO: get all customers
        return "Hello";
    }

    @GetMapping(path = "/get")                // api/customer/get?id=1001
    public String getCustomerById(@RequestParam String id) {
        // TODO: getCustomer by ID
        return "Get by ID - " + id;
    }

    @GetMapping(value = "/delete/{id}")       // api/customer/delete/1001
    public String deleteCustomer(@PathVariable("id") String id) {
        // TODO: delete customer by ID
        return "Delete by ID - " + id;
    }

    @Autowired
    CustomerRepository repository;

    @PostMapping(value = "/add")
    public String addCustomer(@RequestBody String id) {
        repository.save(new Customer());
        return "Add - " + id;
    }
}
