package com.carrental.carrental.Repository;

import org.springframework.data.repository.CrudRepository;

import com.carrental.carrental.model.carBooking;

public interface bookRepository extends CrudRepository<carBooking, Long> {
    
}
