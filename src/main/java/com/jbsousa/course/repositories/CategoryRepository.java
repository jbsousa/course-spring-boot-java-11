package com.jbsousa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jbsousa.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
