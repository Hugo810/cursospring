package com.br.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
