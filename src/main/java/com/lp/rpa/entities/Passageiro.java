package com.lp.rpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
@Entity
public class Passageiro {
	@Id
	public int codigoPassageiro;
	@Column
	public String cpf;
	
	@Column
	public String nome;
	
}
