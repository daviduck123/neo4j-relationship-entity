package com.example.serviceModel;

import java.util.List;

import com.example.neo.model.Product;

public interface ProductService {

	Product save(Product product);

	List<Product> save(List<Product> products);

	void delete(Product product);

	void delete(List<Product> products);

	Product findById(String id);
}