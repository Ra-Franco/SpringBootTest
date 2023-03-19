package com.springteste.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springteste.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
