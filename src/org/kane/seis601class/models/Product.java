package org.kane.seis601class.models;
//orderable item
public class Product {
	//class members
	private int id;
	private double price;
	private String name;
	
	//constructor
	public Product() {
		
	}
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
