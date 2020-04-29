package com.capgemini.lab03.service;

import java.util.List;

import com.capgemini.lab03.entity.Product;


public interface ProductServiceInterface {
	
	public Product save(Product product);

	public List<Product> reterive();

}
