package com.briup.ioc.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
/*
 * 1,使用autowired对成员作修饰
 * 2，使用autowiredset注入
 * 3,使用autowired构造器注入
 * autowired使用byType的方式注入,如果类型对应bean不存在
 * 或者存在多个，都不能注入。
 * 使用标注@Qualifier制定bean名称之后，可以继续操作
 * 4，spring中不推荐使用autowired，使用Resource代替
 * res 使用是byName的方式注入，作用上和autowired没有区别
 * 
 * */

//@Component
@Repository
//@Configuration
public class Boss {
	@Value("Hello World")
	private String name;
	
	//@Autowired
	@Resource(name="car")
	private Car car;
	
	
	//@Autowired
	@Resource(type=Office.class)
	//@Qualifier("office")
	private Office office;
	
	
	public Boss(){}
	
	
	public Boss(String name, Car car, @Qualifier("office")Office office) {
		super();
		this.name = name;
		this.car = car;
		this.office = office;
	}
	
	
	public String getName() {
		return name;
	}
	@Value("Hello Briup!")
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	
	@Autowired
	public void setCar(@Qualifier("car")Car car) {
		this.car = car;
	}
	public Office getOffice() {
		return office;
	}
	
	@Autowired
	public void setOffice
	(@Qualifier("office")Office office) {
		this.office = office;
	}
}
