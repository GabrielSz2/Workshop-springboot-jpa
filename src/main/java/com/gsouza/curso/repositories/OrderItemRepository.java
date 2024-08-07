package com.gsouza.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsouza.curso.entities.OrderItem;
import com.gsouza.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
