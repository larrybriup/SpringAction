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
// @Configuration
@Repository
public class Boss {

	@Value("1")
	private Long id;

	private String name;

	@Autowired
	@Qualifier("BossCar")
	private Car car;

	@Resource(name = "iwatch")
	private Watch watch;

	@Resource(type = Office.class)
	private Office office;

	private Gun ak47;

	public Boss() {
	}

	public Boss(String name, @Qualifier("car") Car car, Office office) {
		this.name = name;
		this.car = car;
		this.office = office;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public void setCar(Car car) {
		this.car = car;
	}

	public Watch getWatch() {
		return watch;
	}

	public void setWatch(Watch watch) {
		this.watch = watch;
	}

	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	public Gun getAk47() {
		return ak47;
	}

	@Autowired
	public void setAk47(@Qualifier("gun") Gun ak47) {
		this.ak47 = ak47;
	}

	@Override
	public String toString() {
		return "Boss [id=" + id + ", name=" + name + ", car=" + car + ", watch=" + watch + ", office="
						+ office + ", ak47=" + ak47 + "]";
	}

}
