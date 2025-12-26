package com.example.project1.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.project1.model.Category;
import com.example.project1.repository.CategoryRepository;

@Service
public class CategoryService {
	private final CategoryRepository categoryRepository;

	
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}


	public List<Category> geAllCategories() {
		return categoryRepository.findAll();
		
	}
	
	
}
