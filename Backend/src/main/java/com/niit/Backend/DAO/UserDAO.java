package com.niit.Backend.DAO;

import com.niit.Backend.model.Category;
import com.niit.Backend.model.User;

public interface UserDAO 
{
	public boolean insert(User user); 
	public User getUserByEmail(String email);
	public User getUser(int id);
}
