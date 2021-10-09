package com.jbsousa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jbsousa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
