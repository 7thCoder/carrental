// package com.carrental.carrental.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.servlet.ModelAndView;

// import com.carrental.carrental.Repository.carRepository;
// import com.carrental.carrental.model.car;

// import lombok.extern.slf4j.Slf4j;

// @Slf4j
// @Controller
// @RequestMapping("/addcar")
// public class carController {
//     @Autowired
//     private carRepository carRepo;


//     @GetMapping
//     public String addCarForm(){
//         return "addcar";
//     }

//     @PostMapping
//     public void saveCar(@ModelAttribute car newCar){
//         carRepo.save(newCar);
//     }
    
// }
