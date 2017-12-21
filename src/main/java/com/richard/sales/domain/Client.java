package com.richard.sales.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
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
	
	@ElementCollection
	@CollectionTable(name ="TELEPHONE")
	private Set<String> telephones = new HashSet<>();
	
	
	public ClientType getTtype() {
		return ClientType.toEnum(type);
	}

	public void setTtype(ClientType type) {
		this.type = type.getCode();
	}

}
