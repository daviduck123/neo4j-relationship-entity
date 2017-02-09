package com.example.serviceModel;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.neo.model.Product;
import com.example.neo.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product save(Product product) {
		if (product.getId() == null) {
			product.setId(UUID.randomUUID().toString());
		}
		return productRepository.save(product);
	}

	@Override
	public List<Product> save(List<Product> products) {
		for (Product product : products) {
			if (product.getId() == null) {
				product.setId(UUID.randomUUID().toString());
			}
		}
		return (List<Product>) productRepository.save(products);
	}

	@Override
	public void delete(Product product) {
		productRepository.delete(product);
	}

	@Override
	public void delete(List<Product> products) {
		productRepository.delete(products);
	}

	@Override
	public Product findById(String id) {
		return productRepository.findById(id);
	}
}