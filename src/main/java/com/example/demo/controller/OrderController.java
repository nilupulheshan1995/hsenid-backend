package com.example.demo.controller;

import com.example.demo.payload.request.AddOrderRequest;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping(value = "/getAll")
    public ResponseEntity getAllOrders(){
        return orderService.getAllOrders();
    }

    @PostMapping(value = "/add")
    public ResponseEntity placeOrder(@RequestBody AddOrderRequest order){
        return orderService.addOrder(order);
    }

    @GetMapping(value = "/get/{oid}")
    public ResponseEntity<List> itemsbyOrder(@PathVariable("oid") String orderID ){
        return orderService.getAllItemsByOrder(Long.parseLong(orderID));
    }

}
