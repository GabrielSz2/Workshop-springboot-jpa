package com.gsouza.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsouza.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
