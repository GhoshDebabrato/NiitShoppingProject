package com.niit.Backend.Test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Backend.DAO.UserDAO;
import com.niit.Backend.model.User;



public class UserTest 
{
	private static AnnotationConfigApplicationContext context;
	static User user;
	static UserDAO userDAO;
	
	
	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.Backend");
		context.refresh();
		
		userDAO = (UserDAO)context.getBean("userDAO");
	}
	
	/*
	@Test
	public void testInsert()
	{
		
		user = new User();
		user.setContactNumber("1234567890");
		user.setEmail("kp@gmail.com");
		user.setFirstName("Kapil");
		user.setLastName("Sharma");
		user.setPassword("sup12345");
		user.setRole("SUPPLIER");
		
		
		
		user = new User();
		user.setContactNumber("1234567890");
		user.setEmail("niit@gmail.com");
		user.setFirstName("Niit");
		user.setLastName("Saltlake");
		user.setPassword("admin12345");
		user.setRole("ADMIN");
		
		
		
		user = new User();
		user.setContactNumber("1234567890");
		user.setEmail("sumit_das@gmail.com");
		user.setFirstName("Sumit");
		user.setLastName("Das");
		user.setPassword("12345");
		user.setRole("USER");
		
		
		assertEquals("Error",true,userDAO.insert(user));
	}
	
	 */
	
	/*
	
	@Test
	public void testGetUser()
	{
		assertEquals("Error" , "niit@gmail.com" , userDAO.getUser(2).getEmail());
	}
	*/
	
	@Test
	public void testGetUserByEmail()
	{
		assertEquals("Error" , 2, userDAO.getUserByEmail("niit@gmail.com").getId());
	}
	
	
}
