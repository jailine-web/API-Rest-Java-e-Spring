package com.estudos.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.demo.entities.Department;
import com.estudos.demo.entities.Product;

@RestController
@RequestMapping(value="/products")
public class ProductController {

	@GetMapping
	public List<Product> getProducts() {
		
		Department d1 = new Department(1L, "Tech");
		Department d2 = new Department(2L, "Pet");
		
		Product p1 = new Product(1L, "PC Gamer", 5000.0, d1);
		Product p2 = new Product(2L, "Pet House", 200.0, d2);
		Product p3 = new Product(1L, "Macbook", 4000.0, d1);
		
		List<Product> products = Arrays.asList(p1,p2, p3);		
		
		return products;
	}
}
