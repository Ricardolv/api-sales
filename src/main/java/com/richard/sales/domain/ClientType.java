package com.richard.sales.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ClientType {
	
	PHYSICAL_PERSON(1, "Pessoa Física"),
	LEGAL_PERSON(2, "Pessoa Jurídica");
	
	private int code;
	private String description;
	
	public static ClientType toEnum(Integer id) {
		if (id == null) { 
			return null;
		}
		
		for (ClientType x : ClientType.values()) { 
			if (id.equals(x.getCode())) {
				return x; 
			}
		}
		throw new IllegalArgumentException("Id inválido " + id); 
	}


}
