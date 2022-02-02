package com.ecommerce.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.model.Status;

public interface StatusRepository extends JpaRepository<Status, Long>{
	public List<Status> findAllByNomeStatusContainingIgnoreCase(String nome);
		
}
