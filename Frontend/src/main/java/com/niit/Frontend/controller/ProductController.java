package com.niit.Frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Backend.DAO.CategoryDAO;

@Controller
@RequestMapping(value="/product")
public class ProductController 
{
	@Autowired
	CategoryDAO categoryDAO;

	@RequestMapping(value="/view/all/product")
	public ModelAndView allProduct()
	{
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("title" , "NIIT SHOPPING All Products");
		mv.addObject("userclickallproduct" , true);
		mv.addObject("categoryList" , categoryDAO.listCategory());
		
		
		return mv;
	}
	
	@RequestMapping(value="/view/category/{id}/product")
	public ModelAndView categoryProduct(@PathVariable("id") int c_id)
	{
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("title" , "NIIT SHOPPING All Products");
		mv.addObject("userclickcategoryproduct" , true);
		mv.addObject("category",categoryDAO.getCategory(c_id));
		mv.addObject("categoryList" , categoryDAO.listCategory());
		
		
		return mv;
	}
}
