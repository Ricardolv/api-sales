package com.richard.sales.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richard.sales.domain.Category;
import com.richard.sales.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public Category searchCategoryById(Integer id) {
		return repository.findOne(id);
	}

}
