package com.richard.sales.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richard.sales.domain.Product;
import com.richard.sales.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public Product searchProductById(Integer id) {
		return repository.findOne(id);
	}

}
