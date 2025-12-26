package com.example.project1.service;
import java.util.*;


import org.springframework.stereotype.Service;

import com.example.project1.model.Product;
import com.example.project1.repository.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public List<Product> getAppProducts(){
		return productRepository.findAll();
		
	}
	
	public  List<Product> getProductByCategory(Long categoryId){
		return productRepository.findByCategoryId(categoryId);
		
	}

}
