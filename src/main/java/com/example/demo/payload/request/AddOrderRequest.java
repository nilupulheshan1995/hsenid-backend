package com.example.demo.payload.request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Collection;

@Getter
@Setter
public class AddOrderRequest {
    private BigDecimal sellTotal;
    private BigDecimal costTotal;
    private BigDecimal discount;
    private Long customer;
    private Collection<OrderDetailDTO> orderDetials;

}
