package com.ecommerce.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Esse campo deve ter pelo menos 1 caracter e no max 100")
	@Size(min = 1, max  = 100)
	private String tipo;
	
	@NotBlank(message = "Esse campo deve ter pelo menos 1 caracter e no max 100")
	@Size(min = 1, max  = 100)
	private String habitate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getHabitate() {
		return habitate;
	}

	public void setHabitate(String habitate) {
		this.habitate = habitate;
	} 
}
