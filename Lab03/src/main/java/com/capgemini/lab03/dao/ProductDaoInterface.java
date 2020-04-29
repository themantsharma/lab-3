package com.capgemini.lab03.dao;

import java.util.List;

import com.capgemini.lab03.entity.Product;


public interface ProductDaoInterface {
	
	public boolean create(Product product);
	public List<Product> reterive();
	

}
