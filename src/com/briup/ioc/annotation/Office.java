package com.briup.ioc.annotation;

import org.springframework.stereotype.Component;


@Component
public class Office {
	private String oNo = "001";
	
	public Office(){}
	
	public Office(String oNo) {
		super();
		this.oNo = oNo;
	}

	public String getoNo() {
		return oNo;
	}

	public void setoNo(String oNo) {
		this.oNo = oNo;
	}
	
}
