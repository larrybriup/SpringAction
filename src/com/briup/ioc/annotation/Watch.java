package com.briup.ioc.annotation;

import org.springframework.stereotype.Component;

//the default component name is the class name's lowwercase: watch
@Component("iwatch")
public class Watch {

	private String brand;

	public Watch() {
	}

	public Watch(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Watch [brand=" + brand + "]";
	}

}
