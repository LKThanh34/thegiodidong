package com.lekimthanh.thegioididong.domain;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public class Role {
    @Id
    private String roleId;
    private String name;
   
    @OneToMany(mappedBy = "role")
    List<Authority> authorities;

}
