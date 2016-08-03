package com.niit.frontcrud.service.impl;

import java.util.List;

import com.niit.frontcrud.model.Foodproducts;


public interface FoodproductsService {
	public void add(Foodproducts foodproducts);
	public void edit(Foodproducts foodproducts);
	public void delete(int productId);
	public Foodproducts getFoodproducts(int productId);
	public List getAllFoodproducts();
}
