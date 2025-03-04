package com.gabrielabreu542.medbooking.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
@Table(name = "tb_medics")
public class Medic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length=100)
	private String name;
	
	@Column(nullable = false, unique = true, length = 15)
	private String crm;
	
	@Column(nullable = false, length = 30)
	private String specialty;
	
	@Column(nullable = true, length = 100)
	private String email;
	
	@Column(nullable = true, length = 15)
	private String phone;
	
}
