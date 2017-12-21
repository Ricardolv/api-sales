package com.richard.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.richard.sales.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
