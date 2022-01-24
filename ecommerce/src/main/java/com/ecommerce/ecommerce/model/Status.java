package com.ecommerce.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "status")
public class Status {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Esse campo deve ter pelo menos 1 caracter")
	@Size(min = 1, max  =10)
	private String nomeStatus;
	
	@NotBlank(message = "Esse campo deve ter pelo menos 1 caracter")
	@Size(min = 1, max  =10)
	private String valorStatus;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeStatus() {
		return nomeStatus;
	}

	public void setNomeStatus(String nomeStatus) {
		this.nomeStatus = nomeStatus;
	}

	public String getValorStatus() {
		return valorStatus;
	}

	public void setValorStatus(String valorStatus) {
		this.valorStatus = valorStatus;
	}
	
	

}
