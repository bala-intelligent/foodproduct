package com.niit.frontcrud.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.frontcrud.model.Foodproducts;
import com.niit.frontcrud.service.impl.FoodproductsService;

@Controller
public class FoodproductsController {
	@Autowired
	private FoodproductsService foodproductsService;
		
		@RequestMapping("/")
		public String grtHome(){
			return "index";
		}
		@RequestMapping("/food")
		public String setupForm(Map<String, Object>map){
			Foodproducts foodproducts = new Foodproducts();
			map.put("foodproducts", foodproducts);
			map.put("foodproductsList", foodproductsService.getAllFoodproducts());
			return "frontcrud";
		}
		@RequestMapping(value="/foodproducts.do",method =RequestMethod.POST)
		public String doActions(@ModelAttribute Foodproducts foodproducts,BindingResult result,@RequestParam String action,Map<String, Object>map){
			Foodproducts foodproductsdelivery = new Foodproducts();
			switch(action.toLowerCase()){
			case "add":
				foodproductsService.add(foodproducts);
				foodproductsdelivery=foodproducts; 
				break;
			case "edit":
				foodproductsService.edit(foodproducts);
				foodproductsdelivery=foodproducts;
				break;
			case "delete":
				foodproductsService.delete(foodproducts.getProductId());
				foodproductsdelivery=new Foodproducts();
				break;
			case "search":	
			Foodproducts searchedFoodproducts=	foodproductsService.getFoodproducts(foodproducts.getProductId());
				foodproductsdelivery=searchedFoodproducts!=null ? searchedFoodproducts:new Foodproducts();
				break;
				}
			map.put("foodproducts", foodproductsdelivery);
			map.put("foodproductsList", foodproductsService.getAllFoodproducts());
			return "foodproducts";
}
}
