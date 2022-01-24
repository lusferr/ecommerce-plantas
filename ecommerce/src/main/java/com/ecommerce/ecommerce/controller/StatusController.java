package com.ecommerce.ecommerce.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.model.Status;
import com.ecommerce.ecommerce.repository.StatusRepository;

@RestController
@RequestMapping("/status")
@CrossOrigin("*")
public class StatusController {

	private StatusRepository repository;
	
	public ResponseEntity<List<Status>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
}
