package com.carrental.carrental.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "carBooking")
@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@AllArgsConstructor
public class carBooking implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private user user;

    @ManyToOne
    private car car;

    private String username;
    private String adress;
    private String brand;
    private String year;
    private String price;

    
    // public carBooking(String username, String adress, String brand, String yer, String price){
    //     this.username = user.getUsername();
    //     this.adress = user.getAdress();
    //     this.brand = car.getBrand();
    //     this.yer = car.getYer();
    //     this.price = car.getPrice();
    // }

}
