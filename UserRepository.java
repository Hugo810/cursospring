package com.br.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
