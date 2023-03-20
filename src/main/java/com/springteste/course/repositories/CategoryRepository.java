package com.springteste.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springteste.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
