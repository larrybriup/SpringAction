package com.briup.theory.ioc;

public class TempValue {

	private String propertyName;
	private String refName;

	public TempValue() {
	}

	public TempValue(String propertyName, String refName) {
		this.propertyName = propertyName;
		this.refName = refName;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getRefName() {
		return refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
	}
}
