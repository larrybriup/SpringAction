package com.briup.ioc.proEdit;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.config.CustomEditorConfigurer;

public class ProEditTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		CustomEditorConfigurer config = 
			new CustomEditorConfigurer();
		Map<String, String> customerEdits = 
			new TreeMap<String, String>();
		customerEdits.put("com.briup.ioc.proEdit.Address", 
		"com.briup.ioc.proEdit.AddressEdit");
		config.setCustomEditors(customerEdits);
		
		Student stu = new Student();
		stu.setsNo(102);
		stu.setName("kevin");
		String addStr = "kunshan,xueyuan.rd,China";
		
		String editname = customerEdits.get
		("com.briup.ioc.proEdit.Address");
		AddressEditor myEdit = (AddressEditor) 
		Class.forName(editname).newInstance();
		myEdit.setAsText(addStr);
		stu.setAddress((Address)myEdit.getValue());
		System.out.println(stu);
	}
	
}
