package com.example.project1.model;

//import java.util.*;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import lombok.Data;
//
//@Entity
//@Data
//public class Category {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	
//	private Long id;
//	private String name;
//	
//	@OneToMany(mappedBy = "category", 
//			   cascade = CascadeType.ALL,
//			   fetch = FetchType.LAZY)
//	private Set<Product> products;
//	
//
//}



import java.util.HashSet;


import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(
        mappedBy = "category",
        cascade = CascadeType.ALL,
        fetch = FetchType.LAZY
    )
    @JsonIgnore
    private Set<Product> products = new HashSet<>();

    // ✅ No-args constructor (REQUIRED by JPA)
    public Category() {
    }

    // ✅ Optional constructor
    public Category(String name) {
        this.name = name;
    }

    // ✅ Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}

