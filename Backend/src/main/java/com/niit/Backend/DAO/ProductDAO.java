package com.niit.Backend.DAO;

import java.util.List;

import com.niit.Backend.model.Product;

public interface ProductDAO 
{
	Product getProduct(int productId);
	List<Product> productList();	
	boolean insert(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	List<Product> listActiveProducts();	
	List<Product> listActiveProductsByCategory(int categoryId);
	

}
