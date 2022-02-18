package com.niit.Frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Backend.DAO.CategoryDAO;

@Controller
public class FrontController 
{
	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping(value={"/index","/","/home"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("title" , "NIIT SHOPPING HOMEPAGE");
		mv.addObject("userclickhomepage" , true);
		mv.addObject("categoryList" , categoryDAO.listCategory());
		
		
		return mv;
	}
	
	
	@RequestMapping(value="/aboutus")
	public ModelAndView aboutus()
	{
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("title" , "NIIT SHOPPING ABOUT US");
		mv.addObject("userclickaboutuspage" , true);
		
		return mv;
	}
	
	@RequestMapping(value="/services")
	public ModelAndView services()
	{
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("title" , "NIIT SHOPPING SERVICES");
		mv.addObject("userclickservicespage" , true);
		
		return mv;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("title" , "NIIT SHOPPING CONTACT");
		mv.addObject("userclickcontactpage" , true);
		
		return mv;
	}
	

}
