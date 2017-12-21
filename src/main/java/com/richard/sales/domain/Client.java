package com.richard.sales.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@EqualsAndHashCode(of ={"id"})
@Data
@Entity
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NonNull
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	
	@NonNull
	private String name;
	
	private Integer type;
	
	
	
	public ClientType getTtype() {
		return ClientType.toEnum(type);
	}

	public void setTtype(ClientType type) {
		this.type = type.getCode();
	}

}
