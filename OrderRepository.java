package com.br.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
