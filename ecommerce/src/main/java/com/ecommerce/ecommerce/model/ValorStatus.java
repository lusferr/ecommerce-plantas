package com.ecommerce.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "valor_status")
public class ValorStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Esse campo deve ter pelo menos 1 caracter")
	private String valorStatus;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getValorStatus() {
		return valorStatus;
	}

	public void setValorStatus(String valorStatus) {
		this.valorStatus = valorStatus;
	}

	
	
	

}
