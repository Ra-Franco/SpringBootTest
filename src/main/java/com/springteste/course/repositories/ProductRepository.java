package com.springteste.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springteste.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
