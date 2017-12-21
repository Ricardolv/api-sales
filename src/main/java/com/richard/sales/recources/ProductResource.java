package com.richard.sales.recources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.richard.sales.domain.Product;
import com.richard.sales.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductResource {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/id")
	public ResponseEntity<Product> searchProductById(@PathVariable Integer id) {
		Product product = this.productService.searchProductById(id);
        return product != null ? ResponseEntity.ok(product) : ResponseEntity.notFound().build();
	}

}
