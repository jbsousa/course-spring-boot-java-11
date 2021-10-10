package com.jbsousa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jbsousa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
