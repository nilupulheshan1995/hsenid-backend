package com.example.demo.repository;

import com.example.demo.entity.Order1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order1,Long> {
}
