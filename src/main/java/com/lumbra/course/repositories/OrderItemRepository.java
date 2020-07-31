package com.lumbra.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lumbra.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
	
}
