package com.gsouza.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsouza.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
