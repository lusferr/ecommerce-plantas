package com.ecommerce.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.model.ValorStatus;
import com.ecommerce.ecommerce.repository.ValorStatusRepository;

@RestController
@RequestMapping("/valor-status")
@CrossOrigin("*")
public class ValorStatusController {

	@Autowired
	private ValorStatusRepository repository;
	
	@GetMapping
	public ResponseEntity<List<ValorStatus>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ValorStatus> GetByIdValorStatus(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/valorStatus/{valorStatus}")
	public ResponseEntity<List<ValorStatus>> GetByNomeValorStatus(@PathVariable String valorStatus){
		return ResponseEntity.ok(repository.findAllByValorStatusContainingIgnoreCase(valorStatus));
	}
	
	
	@PostMapping
	public ResponseEntity<ValorStatus> postValorStatus (@RequestBody ValorStatus valorStatus){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(valorStatus));
	}
	
	@PutMapping
	public ResponseEntity<ValorStatus> putValorStatus (@RequestBody ValorStatus valorStatus){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(valorStatus));
	}
	
	@DeleteMapping("/{id}")
	public void deleteValorStatus(@PathVariable long id) {
		repository.deleteById(id);
	}

}
