/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Nilupul
 */
@Entity
@Getter @Setter
@Table(name = "order_details")
public class OrderDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id")
    protected Long orderDetailsPK;

    @Column(name = "qty")
    private Long qty;

    @JoinColumn(name = "item_id", referencedColumnName = "item_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Item item;

    @JoinColumn(name = "order_id", referencedColumnName = "order_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Order1 order1;

    public OrderDetails() {
    }

}
