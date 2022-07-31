package com.example.demo.service;

import com.example.demo.entity.Order1;
import com.example.demo.payload.request.AddOrderRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface OrderService {
    ResponseEntity<List<Order1>> getAllOrders();
    ResponseEntity addOrder(AddOrderRequest order);

    ResponseEntity<List> getAllItemsByOrder(Long orderID);
}
