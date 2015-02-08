package com.briup.ioc.annotation;

import org.springframework.stereotype.Component;


@Component
public class Car {
	private double price;
	private String brand;
	
	public Car(){}
	
	public Car(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
