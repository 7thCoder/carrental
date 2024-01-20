package com.carrental.carrental.Repository;

import org.springframework.data.repository.CrudRepository;

import com.carrental.carrental.model.user;


public interface userRepository extends CrudRepository<user, Long> {
    user findByUsername(String username);
}
