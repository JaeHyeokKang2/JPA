package com.example.jpatest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Entity
@Table(name = "ORDERS")
public class Order {
    @Id @GeneratedValue
    private Long id;
    @Column(name = "MEMBER_ID")
    private Long memberId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
}
