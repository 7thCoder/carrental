package com.carrental.carrental.controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carrental.carrental.Repository.userRepository;
import com.carrental.carrental.security.registrationForm;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/register")

public class registrationController {

    private userRepository userRepo;
    private PasswordEncoder passwordEncoder;

    public registrationController(userRepository userRepo, PasswordEncoder passwordEncoder){
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public String registerForm(){
        return "registration";
    }

    @PostMapping
    public String processRegistration(registrationForm form){
        log.info("User saved: {}",form.toUser(passwordEncoder));
        userRepo.save(form.toUser(passwordEncoder));
        return "redirect:/home";
    }
}
