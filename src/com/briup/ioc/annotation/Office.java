package com.briup.ioc.annotation;

import org.springframework.stereotype.Component;

@Component
public class Office {

	private String officeNo = "001";

	public Office() {
	}

	public Office(String officeNo) {
		this.officeNo = officeNo;
	}

	public String getOfficeNo() {
		return officeNo;
	}

	public void setOfficeNo(String officeNo) {
		this.officeNo = officeNo;
	}

	@Override
	public String toString() {
		return "Office [officeNo=" + officeNo + "]";
	}

}
