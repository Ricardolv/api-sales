package com.richard.sales.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	private String name;
	
	@ManyToMany(mappedBy="categories")
	private List<Product> produtos = new ArrayList<>();

}