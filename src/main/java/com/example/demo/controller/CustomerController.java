package com.example.demo.controller;

import com.example.demo.payload.request.CustomerRequest;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/customer")
public class CustomerController {


    @Autowired
    CustomerService service;

    @GetMapping(path = "/getAll")               // api/customer/getAll
    public ResponseEntity getCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping(path = "/get")                // api/customer/get?id=1001
    public ResponseEntity getCustomerById(@RequestParam String id) {
        return service.getCustomerById(Long.parseLong(id));
    }

    @GetMapping(value = "/delete/{id}")       // api/customer/delete/1001
    public ResponseEntity deleteCustomer(@PathVariable("id") String id) {
        return service.deleteCustomer(Long.parseLong(id));
    }


    @PostMapping(value = "/add")
    public ResponseEntity addCustomer(@RequestBody CustomerRequest customer) {
        return service.addCustomer(customer);
    }
}
