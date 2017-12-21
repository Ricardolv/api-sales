package com.richard.sales.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TypeClient {
	
	PHYSICAL_PERSON(1, "Pessoa Física"),
	LEGAL_PERSON(2, "Pessoa Jurídica");
	
	private int cod;
	private String description;
	
	public static TypeClient toEnum(Integer id) {
		if (id == null) { 
			return null;
		}
		
		for (TypeClient x : TypeClient.values()) { 
			if (id.equals(x.getCod())) {
				return x; 
			}
		}
		throw new IllegalArgumentException("Id inválido " + id); 
	}


}
