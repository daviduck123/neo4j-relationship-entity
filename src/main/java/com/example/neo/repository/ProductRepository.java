package com.example.neo.repository;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.example.neo.model.Product;

public interface ProductRepository extends GraphRepository<Product> {
	Product findById(String id);
}
