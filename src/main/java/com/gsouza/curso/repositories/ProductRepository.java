package com.gsouza.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsouza.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
