package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Product;
import com.repository.ProductRepository;

@Service
public class ProductServiceIMPL  implements ProductService{
@Autowired
private ProductRepository repo;
	@Override
	public List<Product> getAllData() {
	
		return repo.findAll() ;
	}
	@Override
	public Optional<Product> getProductById(int productId) {
		
		return repo.findById(productId);
	}

}
