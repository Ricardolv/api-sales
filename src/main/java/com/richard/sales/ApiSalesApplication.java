package com.richard.sales;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.richard.sales.domain.Category;
import com.richard.sales.domain.Product;
import com.richard.sales.repository.CategoryRepository;
import com.richard.sales.repository.ProductRepository;

@SpringBootApplication
public class ApiSalesApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(ApiSalesApplication.class, args);
	}
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... arg0) throws Exception {
		
		Category category1 = new Category(1, "Informática");
		Category category2 = new Category(2, "Escritório");
		
		
		Product product1 = new Product(1, "Computador", new BigDecimal("200.00"));
		Product product2 = new Product(2, "Impressora", new BigDecimal("800.00"));
		Product product3 = new Product(3, "Mouse", new BigDecimal("80.00"));
		
		//category1.getProducts().addAll(Arrays.asList(product1, product2, product3));
		//category2.getProducts().addAll(Arrays.asList(product2));
		
		product1.getCategories().addAll(Arrays.asList(category1));
		product2.getCategories().addAll(Arrays.asList(category1, category2));
		product3.getCategories().addAll(Arrays.asList(category1));
		
		categoryRepository.save(Arrays.asList(category1, category2));
		productRepository.save(Arrays.asList(product1, product2, product3));
	}
	
	
	
}
