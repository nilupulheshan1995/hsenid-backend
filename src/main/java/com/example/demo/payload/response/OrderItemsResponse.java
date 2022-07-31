package com.example.demo.payload.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class OrderItemsResponse {
    private String item;
    private String description;
    private BigDecimal qty;
    private Long unitPrice;
    private double subTotal;

    public void calculate(){
        this.subTotal = qty.doubleValue()*unitPrice.doubleValue();
    }
}
