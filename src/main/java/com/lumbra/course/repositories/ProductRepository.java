package com.lumbra.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lumbra.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
	
}
