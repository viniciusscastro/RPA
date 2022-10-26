package com.lp.rpa.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
@Embeddable
public class ReservaId implements Serializable{
	short codigoAssento;
	boolean codigoVoo;
}
