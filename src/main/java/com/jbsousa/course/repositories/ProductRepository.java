package com.jbsousa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jbsousa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
