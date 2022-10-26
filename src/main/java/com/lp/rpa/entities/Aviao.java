package com.lp.rpa.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
@Entity
public class Aviao {
	
	@EmbeddedId
	private Aeronave aeronave;
	
	
	
	
}
