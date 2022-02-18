package com.niit.Backend.Test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Backend.DAO.ProductDAO;
import com.niit.Backend.DAO.UserDAO;
import com.niit.Backend.model.Product;
import com.niit.Backend.model.User;

public class ProductTest 
{
	private static AnnotationConfigApplicationContext context;
	static User user;
	static Product product;
	static UserDAO userDAO;
	static ProductDAO productDAO;
	
	
	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.Backend");
		context.refresh();
		
		userDAO = (UserDAO)context.getBean("userDAO");
		productDAO = (ProductDAO)context.getBean("productDAO");
	}
	/*
	@Test
	public void testInsertProduct()
	{
		product = new Product();
		
		
		product.setName("POCO X3 Pro");
		product.setBrand("POCO");
		product.setActive(true);
		product.setCategoryId(2);
		product.setDescription("6.67 inches (16.94 cm) 395 PPI ," + 
				"8GB RAM ,128GB ROM ," + 
				"48MP + 8MP + 2MP + 2MP Quad Primary Cameras , 20MP Front Camera " 
				);
		product.setPurchases(0);
		product.setQuantity(15);
		product.setSupplierId(userDAO.getUserByEmail("am@gmail.com").getId());
		product.setUnitPrice(24999.00);
		product.setViews(0);
		
		
		product.setName("Legion 5i");
		product.setBrand("Lenovo");
		product.setActive(true);
		product.setCategoryId(1);
		product.setDescription("11th Generation Intel® Core™ i7-11800H Processor (8 Cores / 16 Threads, 2.30 GHz, up to 4.60 GHz with Turbo Boost, 24 MB Cache");
		product.setPurchases(0);
		product.setQuantity(5);
		product.setSupplierId(1);
		product.setUnitPrice(159290.00);
		product.setViews(0);
		
		assertEquals("Error" , true , productDAO.insert(product));
	}
*/
	/*
	
	@Test
	public void testUpdate()
	{
		product = productDAO.getProduct(1);
		//assertEquals("Error" ,"POCO X3 Pro" , product.getName());
		
		//product.setUnitPrice(27999);
		
		//assertEquals("Error" , true,productDAO.update(product));
		
		assertEquals("Error", true , productDAO.delete(product));
	}
	
	*/
	
	@Test
	public void testGetProduct()
	{
		//assertEquals("Error",3,productDAO.productList().size());
		
		//assertEquals("Error",2,productDAO.listActiveProducts().size());
		
		assertEquals("Error",1,productDAO.listActiveProductsByCategory(1).size());


		
	}
}
