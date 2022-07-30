package com.example.demo.repository;

import com.example.demo.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetails,Long> {
}
