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
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Nilupul
 */
@Entity
@Getter @Setter
@Table(name = "order_table")
public class OrderEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long order1PK;

    @Column(name = "sell_total")
    private BigDecimal sellTotal;

    @Column(name = "cost_total")
    private BigDecimal costTotal;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "discount")
    private BigDecimal discount;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order1")
//    private Collection<OrderDetailsEntity> orderDetailsCollection;

    @Column(name = "customer_id")
    private Long customer;

    public OrderEntity() {
    }

    public OrderEntity(double sellTotal, double costTotal, Date date, double discount, Long customer) {
        this.sellTotal = new BigDecimal(sellTotal);
        this.costTotal = new BigDecimal(costTotal);
        this.date = date;
        this.discount = new BigDecimal(discount);
        this.customer = customer;
    }
}
