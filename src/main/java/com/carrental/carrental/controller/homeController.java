package com.carrental.carrental.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.web.exchanges.HttpExchange.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.carrental.carrental.Repository.bookRepository;
import com.carrental.carrental.Repository.carRepository;
import com.carrental.carrental.Repository.userRepository;
import com.carrental.carrental.model.car;
import com.carrental.carrental.model.carBooking;
import com.carrental.carrental.model.user;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class homeController{
    @Autowired
    private carRepository carRepo;

    @Autowired
    private userRepository userRepo;

    @Autowired
    private bookRepository bookRepo;
   
    @GetMapping({"/","/home"})
    public ModelAndView showCars(){
        ModelAndView mav = new ModelAndView("home");
        Iterable<car> list = carRepo.findAll();
        mav.addObject("cars", list);
        return mav;
    }

    @GetMapping({"/cars"})
    public ModelAndView customerView(){
        ModelAndView mav = new ModelAndView("cars");
        Iterable<car> list = carRepo.findAll();
        mav.addObject("cars", list);
        return mav;
    }

    @GetMapping("/login")
    public String logiForm(){
        return "login";
    }

    @GetMapping("/book")
    public String processBooking(@RequestParam Long carId, Principal principal){
        car car = carRepo.findById(carId).get();
        user user = userRepo.findByUsername(principal.getName());
        carBooking carBooking = new carBooking();
        carBooking.setCarInfo(car);
        carBooking.setUser(user);
        log.info("Booking saved: {}",carBooking);
        bookRepo.save(carBooking);
        return "home";
    }
}
