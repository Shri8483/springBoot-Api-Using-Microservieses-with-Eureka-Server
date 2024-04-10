package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Product;
import com.service.ProductService;

@RestController
@RequestMapping("Product")
public class HomeController 
{
 @Autowired
 private ProductService service;
 
 @GetMapping("")
 public List<Product> getAllData() 
 {
	return service.getAllData();
}
 @GetMapping("/{productId}")
 public Optional<Product> getProductById(@PathVariable int productId)
 {
	 return service.getProductById(productId);
 }
}
