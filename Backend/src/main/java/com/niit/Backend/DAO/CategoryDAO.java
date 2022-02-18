package com.niit.Backend.DAO;

import java.util.List;

import com.niit.Backend.model.Category;

public interface CategoryDAO 
{
	public boolean insert(Category category);	
	public List<Category> listCategory();
	Category getCategory(int id);

}
