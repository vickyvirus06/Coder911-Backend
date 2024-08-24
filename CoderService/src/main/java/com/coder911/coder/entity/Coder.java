package com.coder911.coder.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coder {

	@EmbeddedId
	private CoderId id;

	public CoderId getId() {
		return id;
	}

	public void setId(CoderId id) {
		this.id = id;
	}

	
}
