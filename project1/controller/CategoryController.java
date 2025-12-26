package com.example.project1.controller;

import java.util.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.model.Category;
import com.example.project1.service.CategoryService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("api/categories")
public class CategoryController {
	
	private final CategoryService categoryService;
	

	
	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@GetMapping
	public List<Category> getAllCategories(){
		return categoryService.geAllCategories();
		
	}

}
