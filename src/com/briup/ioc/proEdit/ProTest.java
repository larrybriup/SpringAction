package com.briup.ioc.proEdit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProTest {
	@Test
	public  void IOC_proTest() {
		String path="com/briup/ioc/proEdit/proEdit.xml";
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext(path);
//			(new String[]{"com/briup/ioc/proEdit/plugin.xml",
//					"com/briup/ioc/proEdit/proEdit.xml"});
		Student stu = (Student)ctx.getBean("student");
		System.out.println(stu);
	}
}
