package com.carrental.carrental.security;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.carrental.carrental.model.user;

import lombok.Data;

@Data
public class registrationForm {

    private  String username;
    private  String password;
    private  String adress;
    private String phoneNumber;

    public user toUser(PasswordEncoder passwordEncoder){
        return new user(
            username, passwordEncoder.encode(password), adress, phoneNumber
        );
    }
}
