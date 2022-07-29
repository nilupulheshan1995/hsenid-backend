/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

/**
 *
 * @author Asus
 */
@Entity
@Setter
@Getter
@Table(name = "item")
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long itemid;

    @Column(name = "av_stock")
    private Integer avStock;

    @Column(name = "unitPrice")
    private Long unitPrice;

    @Column(name = "unitCost")
    private Long unitCost;

    @Column(name = "preOrderMargin")
    private Integer preOrderMargin;

    @Column(name = "description")
    private String description;

    @JoinColumn(name = "category_id", referencedColumnName = "category_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Category category;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item")
    private Collection<OrderDetails> orderDetailsCollection;
//
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item")
    private Collection<Preorder> preorderCollection;

    public Item() {
    }

    
}
