package com.example.project1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.model.Product;
import com.example.project1.service.ProductService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	
	@GetMapping
	public List<Product> getAllProducts(){
		return productService.getAppProducts();
		
	}
	
	
	@GetMapping("category/{categoryId}")
	public List<Product> getAllProductsByCategory(@PathVariable Long categoryId){
		return productService.getProductByCategory(categoryId);
		
	}
	

}
