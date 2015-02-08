package com.briup.bean;


public class LifeBean{
	private String name;
	private LifeBean lb;
	
	public LifeBean getLb() {
		return lb;
	}
	public void setLb(LifeBean lb) {
		this.lb = lb;
	}
	public LifeBean(){
		System.out.println("LifeBean() cons");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName() action");
		this.name = name;
	}
	
	public void init(){
		System.out.println("this is init in lifeBean");
	}
	
	public void destory(){
		System.out.println("this is destory in lifeBean");
	}
	
}
