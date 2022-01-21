package com.niit.Frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController 
{
	
	@RequestMapping(value={"/index","/","/home"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("title" , "NIIT SHOPPING HOMEPAGE");
		mv.addObject("username" ,"NIIT KOLKATA");
		mv.addObject("City" , "Kolkata");
		mv.addObject("state" ,"WEST BENGAL");
		
		
		return mv;
	}
	
	
	@RequestMapping(value="/aboutus")
	public ModelAndView aboutus()
	{
		ModelAndView mv = new ModelAndView("aboutus");
		
		mv.addObject("title" , "NIIT SHOPPING ABOUT US");
		
		return mv;
	}
	

}
