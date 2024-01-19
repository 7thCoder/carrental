package com.carrental.carrental.model;

import jakarta.persistence.Id;
// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="car")
@AllArgsConstructor
@NoArgsConstructor (access = AccessLevel.PUBLIC, force = true)
@Data
public class car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  String brand;
    private  String yer;
    private String price;
    // private final colors color;    
}
