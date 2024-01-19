package com.carrental.carrental.Repository;


import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.carrental.carrental.model.car;

@Repository
public interface carRepository extends CrudRepository<car, Long >{
    
}
