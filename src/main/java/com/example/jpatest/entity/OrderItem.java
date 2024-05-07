package com.example.jpatest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem {
    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;
    @Column(name = "item_id")
    private Long itemId;
    @Column(name = "order_id")
    private Long orderId;
    private Long orderPrice;
    private Long count;
}
