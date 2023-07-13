package com.br.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
