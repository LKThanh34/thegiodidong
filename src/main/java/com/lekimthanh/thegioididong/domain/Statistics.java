package com.lekimthanh.thegioididong.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "statistic")
public class Statistics {
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "OrderId")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "OrderDetailId")
    private OrderDetail OrderDetail;

    private long orders;

    private long revenues;
}
