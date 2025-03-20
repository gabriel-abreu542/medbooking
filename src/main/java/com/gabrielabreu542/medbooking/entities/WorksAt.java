package com.gabrielabreu542.medbooking.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_works_at")
public class WorksAt {

	@EmbeddedId
	private WorksPK id;
	private Integer position;
	
	
}
