package com.example.demo.payload.request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class OrderDetailDTO {
    private BigDecimal qty;
    private Long item;
}
