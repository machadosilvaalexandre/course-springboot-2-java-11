package com.lumbra.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lumbra.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
	
}
