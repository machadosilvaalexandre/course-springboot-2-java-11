package com.lumbra.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lumbra.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
