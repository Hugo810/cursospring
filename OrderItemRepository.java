package com.br.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	

}
