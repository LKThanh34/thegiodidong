package com.lekimthanh.thegioididong.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "statistic")
@NoArgsConstructor
@AllArgsConstructor
public class Statistics implements Serializable{
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "OrderId")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "OrderDetailId")
    private OrderDetail OrderDetail;

    private Long orders;

    private Long revenues;
}
