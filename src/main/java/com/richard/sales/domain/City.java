package com.richard.sales.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@EqualsAndHashCode(of ={"id"})
//@Data
//@Entity
public class City implements Serializable {

	private static final long serialVersionUID = 1L;
	
//	@Id 
//	@GeneratedValue(strategy=GenerationType.IDENTITY) 
//	private Integer id;
//	private String name;
//	
//	@ManyToOne 
//	@JoinColumn(name="state_id") 
//	private State state;

}
