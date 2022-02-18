package com.niit.Frontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Backend.DAO.ProductDAO;
import com.niit.Backend.model.Product;



@Controller
@RequestMapping(value="/json/data")
public class JsonController 
{
	@Autowired
	ProductDAO productDAO;
	
	Product product;
	
	@RequestMapping(value="/view/all/active/products")
	@ResponseBody
	public List<Product> getAllActiveProducts() {
		return productDAO.listActiveProducts();
	}
	
	@RequestMapping(value="/view/all/products")
	@ResponseBody
	public List<Product> getAllProducts() {
		return productDAO.productList();
	}
	
	@RequestMapping("/view/category/{id}/products")
	@ResponseBody
	public List<Product> getProductsByCategory(@PathVariable int id) {
		return productDAO.listActiveProductsByCategory(id);
	}
}
