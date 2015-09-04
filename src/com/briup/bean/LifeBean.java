package com.briup.bean;

public class LifeBean {

	private String name;
	private LifeBean prototypeBean;

	public LifeBean() {
		System.out.println("LifeBean() constructor");
	}

	public void init() {
		System.out.println("this is init in lifeBean");
	}

	public void destory() {
		System.out.println("this is destory in lifeBean");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName() action");
		this.name = name;
	}

	public LifeBean getPrototypeBean() {
		return prototypeBean;
	}

	public void setPrototypeBean(LifeBean prototypeBean) {
		this.prototypeBean = prototypeBean;
	}

}
