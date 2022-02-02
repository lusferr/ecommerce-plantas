package com.ecommerce.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.model.ValorStatus;

public interface ValorStatusRepository extends JpaRepository<ValorStatus, Long>{
	public List<ValorStatus> findAllByValorStatusContainingIgnoreCase(String valorStatus);
}
