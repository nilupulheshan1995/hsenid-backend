package com.example.demo.service.impl;

import com.example.demo.entity.Order1;
import com.example.demo.payload.request.AddOrderRequest;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public ResponseEntity<List<Order1>> getAllOrders() {
        List<Order1> all = orderRepository.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }

    @Override
    public ResponseEntity addOrder(AddOrderRequest order) {
        ModelMapper mapper = new ModelMapper();
        Order1 orderEntity = mapper.map(order, Order1.class);
        orderEntity.setDate(getDate());

        Order1 saved = orderRepository.save(orderEntity);
        saveOrderDetails(order);
        return new ResponseEntity<>(saved,HttpStatus.OK);
    }

    private void saveOrderDetails(AddOrderRequest order) {
        //
    }

    private Date getDate() {
        java.sql.Date date = new java.sql.Date(new Date().getTime());
        return date;
    }


}
