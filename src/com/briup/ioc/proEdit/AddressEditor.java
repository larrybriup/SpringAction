package com.briup.ioc.proEdit;

import java.beans.PropertyEditorSupport;
import java.util.StringTokenizer;

public class AddressEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		StringTokenizer st = new StringTokenizer(text, ":");
		String city = st.nextToken().trim();
		String street = st.nextToken().trim();
		String country=st.nextToken().trim();
//		String country = ((String)st.nextElement()).trim();
		Address add = new Address(city, street, country);
		setValue(add);
	}
	
}
