package com.ecommerce.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.model.Status;
import com.ecommerce.ecommerce.repository.StatusRepository;

@RestController
@RequestMapping("/status")
@CrossOrigin("*")
public class StatusController {

	@Autowired
	private StatusRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Status>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Status> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nomeStatus/{nomeStatus}")
	public ResponseEntity<List<Status>> GetByNomeStatus(@PathVariable String nomeStatus){
		return ResponseEntity.ok(repository.findAllByNomeStatusContainingIgnoreCase(nomeStatus));
	}
	
	@PostMapping
	public ResponseEntity<Status> postStatus (@RequestBody Status status){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(status));
	}
	
}
