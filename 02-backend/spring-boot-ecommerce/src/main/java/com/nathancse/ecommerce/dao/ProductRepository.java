package com.nathancse.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nathancse.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
