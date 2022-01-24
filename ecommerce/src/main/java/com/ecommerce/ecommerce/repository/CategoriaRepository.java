package com.ecommerce.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{	
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);
}
