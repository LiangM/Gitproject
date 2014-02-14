package com.SpringMVC.common.service;

public class Car {
	private Long id;
	private String brand;
	private String model;
	private double price;
 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Car(Long id,String brand, String model,double price){
		setId(id);
		setBrand(brand);
		setModel(model);
		setPrice(price);
	}
}