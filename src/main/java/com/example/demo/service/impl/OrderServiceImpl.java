package com.example.demo.service.impl;

import com.example.demo.entity.Order1;
import com.example.demo.entity.OrderDetails;
import com.example.demo.payload.request.AddOrderRequest;
import com.example.demo.payload.request.OrderDetailDTO;
import com.example.demo.repository.OrderDetailRepository;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderDetailRepository detailRepository;

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
        saveOrderDetails(order,saved);
        return new ResponseEntity<>(saved,HttpStatus.OK);
    }

    private void saveOrderDetails(AddOrderRequest order, Order1 savedOrder) {
        Collection<OrderDetailDTO> orderDetials = order.getOrderDetials();
        for (OrderDetailDTO orderD : orderDetials) {
            System.out.println(orderD.getItem()+" - "+orderD.getQty());
            OrderDetails details = new OrderDetails();
            details.setItem(orderD.getItem());
            details.setQty(orderD.getQty());
            details.setOrder(savedOrder.getOrder1PK());
            detailRepository.save(details);
        }

    }

    private Date getDate() {
        java.sql.Date date = new java.sql.Date(new Date().getTime());
        return date;
    }


}
