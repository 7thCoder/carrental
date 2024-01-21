package com.carrental.carrental.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.carrental.carrental.Repository.carRepository;
import com.carrental.carrental.model.car;


@Controller
public class homeController{
    @Autowired
    private carRepository carRepo;
   
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

   
}
