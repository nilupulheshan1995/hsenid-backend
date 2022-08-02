/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.*;

/**
 * @author Asus
 */
@Entity
@Setter
@Getter
@Table(name = "item")
public class ItemEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long itemid;

    @Column(name = "name")
    private String name;

    @Column(name = "av_stock")
    private BigDecimal avStock;

    @Column(name = "unitPrice")
    private Long unitPrice;

    @Column(name = "unitCost")
    private Long unitCost;

    @Column(name = "preOrderMargin")
    private Integer preOrderMargin;

    @Column(name = "description")
    private String description;

    @Column(name = "category_id")
    private Long category_id;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item")
//    private Collection<OrderDetailsEntity> orderDetailsCollection;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item")
    private Collection<PreorderEntity> preorderCollection;

    public ItemEntity() {
    }

    public ItemEntity(String name, String description, double avStock, Long unitPrice, Long unitCost, Integer preOrderMargin, Long category_id) {
        this.name = name;
        this.avStock = new BigDecimal(avStock);
        this.unitPrice = unitPrice;
        this.unitCost = unitCost;
        this.preOrderMargin = preOrderMargin;
        this.description = description;
        this.category_id = category_id;
    }
}
