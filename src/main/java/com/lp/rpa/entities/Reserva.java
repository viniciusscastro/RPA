package com.lp.rpa.entities;

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
public class Reserva {
	@EmbeddedId
	private ReservaId chaveReserva;
	
	@Column
	int codigoPassageiro;
	
	
	
}
