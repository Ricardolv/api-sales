package com.richard.sales.recource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryResource {
	
	@GetMapping
	public String list() {
		return "REST está funcionando!";
	}

}
