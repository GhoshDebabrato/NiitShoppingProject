package com.niit.Backend.Test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Backend.DAO.CategoryDAO;
import com.niit.Backend.model.Category;


public class CategoryTest 
{
	private static AnnotationConfigApplicationContext context;
	static Category category;
	static CategoryDAO categoryDAO;
	
	
	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.Backend");
		context.refresh();
		
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	

	/*
	@Test
	public void testAddCategory()
	{
		category = new Category();
		category.setName("Laptop");
		category.setDescription("Sample Laptop Category");
		category.setActive(true);
		assertEquals("Error adding category",true,categoryDAO.insert(category));
		
		category = new Category();
		category.setName("Smart Phone");
		category.setDescription("Sample category for smart phone");
		category.setActive(true);
		assertEquals("Error adding category",true,categoryDAO.insert(category));
		
		category = new Category();
		category.setName("Desktop");
		category.setDescription("Sample desktop Category");
		category.setActive(true);
		assertEquals("Error adding category",true,categoryDAO.insert(category));
		
		category = new Category();
		category.setName("Smart Tv");
		category.setDescription("Sample smart Tv Category");
		category.setActive(true);
		assertEquals("Error adding category",true,categoryDAO.insert(category));
		
		category = new Category();
		category.setName("Smart Watch");
		category.setDescription("Sample smart watch Category");
		category.setActive(true);
		assertEquals("Error adding category",true,categoryDAO.insert(category));
	}
	*/
	/*
	@Test
	public void testCategoryList()
	{
		assertEquals("Error", 5 , categoryDAO.listCategory().size());
	}
	*/
	
	@Test
	public void testAddCategory()
	{
		category = new Category();
		category.setName("Music Player");
		category.setDescription("Sample Music Player Category");
		category.setActive(true);
		assertEquals("Error adding category",true,categoryDAO.insert(category));
		
		
	}
	


}
