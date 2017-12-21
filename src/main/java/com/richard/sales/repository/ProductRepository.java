package com.richard.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.richard.sales.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
