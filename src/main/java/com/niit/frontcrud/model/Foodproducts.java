package com.niit.frontcrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="frontcrud")
public class Foodproducts {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
private int productId;
	@Column
private String vegetarian;
	@Column
private String nonvegetarian;
	@Column
private String snacks;
	@Column
private String beverages;

public Foodproducts()
{
	
}
public Foodproducts(int productId,String vegetarian,String nonvegetarian,String snacks,String beverages)
{
	
}
public String getVegetarian() {
	return vegetarian;
}
public void setVegetarian(String vegetarian) {
	this.vegetarian = vegetarian;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getNonvegetarian() {
	return nonvegetarian;
}
public void setNonvegetarian(String nonvegetarian) {
	this.nonvegetarian = nonvegetarian;
}
public String getSnacks() {
	return snacks;
}
public void setSnacks(String snacks) {
	this.snacks = snacks;
}
public String getBeverages() {
	return beverages;
}
public void setBeverages(String beverages) {
	this.beverages = beverages;
}
}
