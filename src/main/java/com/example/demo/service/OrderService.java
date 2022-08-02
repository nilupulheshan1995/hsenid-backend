package com.example.demo.service;

import com.example.demo.entity.OrderEntity;
import com.example.demo.payload.request.AddOrderRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface OrderService {
    ResponseEntity<List<OrderEntity>> getAllOrders();
    ResponseEntity addOrder(AddOrderRequest order);

    ResponseEntity<List> getAllItemsByOrder(Long orderID);
}
