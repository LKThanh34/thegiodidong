package com.lekimthanh.thegioididong.domain;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "orderDetails")
public class OrderDetail implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderDetailId;

    private Integer price;
    private Integer discount;
    private Integer quantity;
    private String discription;
    private Integer amount;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
}
