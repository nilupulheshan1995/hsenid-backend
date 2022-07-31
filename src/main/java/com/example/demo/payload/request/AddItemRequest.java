package com.example.demo.payload.request;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AddItemRequest {
    private String description;
    private String name;
    private Integer avStock;
    private Long unitPrice;
    private Long unitCost;
    private Integer preOrderMargin;
    private Long categoryId;
}
