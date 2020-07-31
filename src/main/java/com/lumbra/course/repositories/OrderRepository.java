package com.lumbra.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lumbra.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
	
}
