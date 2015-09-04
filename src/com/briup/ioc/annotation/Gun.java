package com.briup.ioc.annotation;

import org.springframework.stereotype.Component;

@Component
public class Gun {

	private Long gunNO;
	private String name;

	public Gun() {
	}

	public Gun(Long gunNO, String name) {
		this.gunNO = gunNO;
		this.name = name;
	}

	public Long getGunNO() {
		return gunNO;
	}

	public void setGunNO(Long gunNO) {
		this.gunNO = gunNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Gun [gunNO=" + gunNO + ", name=" + name + "]";
	}

}
