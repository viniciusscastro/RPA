package com.lp.rpa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
@Entity
public class Voo {
	@EmbeddedId
	private VooId vooId;
	@Column
	private Date DiaHoraEmbarque;
	

	
	
}
