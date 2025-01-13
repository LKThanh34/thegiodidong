package com.lekimthanh.thegioididong.domain;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@SuppressWarnings("serial")
@Entity
@Table(name = "accounts")
@Data
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long accountId;

    private String userName;
    private String password;
    private String fullName;
    private String email;
    private String image;
    private String address;
    private String telePhone;
    private String reset_password;

    @JsonIgnore
    @OneToMany(mappedBy = "account")
    List<Order> orders;

    @JsonIgnore
    @OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
    List<Authority> authorities;

    @JsonIgnore
    @OneToMany(mappedBy = "account")
    List<Comment> comments;

    @JsonIgnore
    @OneToMany(mappedBy = "account")
    List<FeedBack> feedbacks;

}
