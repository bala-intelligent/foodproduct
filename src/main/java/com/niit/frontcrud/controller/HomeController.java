package com.niit.frontcrud.controller;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	public class HomeController {
		
	@RequestMapping(value="/soru")
	public String home()
	{
		return "foodproducts";
	}
	@RequestMapping(value="/login")
	public String getlogin()
	{
		return "login";
	}
	@RequestMapping(value="/about")
	public String getabout()
	{
		return "about";
	}
	@RequestMapping(value="/beverages")
	public String getbeverages()
	{
		return "beverages";
	}
	@RequestMapping(value="/snacks")
	public String getsnacks()
	{
		return "snacks";
	}
	@RequestMapping(value="/vegetarian")
	public String getvegetarian()
	{
		return "vegetarian";
	}
	@RequestMapping(value="/nonvegetarian")
	public String getnonvegetarian()
	{
		return "nonvegetarian";
	}
	@RequestMapping(value="/register")
	public String getregister()
	{
		return "register";
	}
	}



