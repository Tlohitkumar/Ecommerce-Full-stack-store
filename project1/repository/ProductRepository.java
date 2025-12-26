package com.example.project1.repository;

import java.util.*;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project1.model.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	List<Product> findByCategoryId(Long categoryId);
}
