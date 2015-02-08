package com.briup.ioc.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnTest {
	
	@Test
	public void test(){
		try{
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext
			("com/briup/ioc/annotation/annotation.xml");
		Boss boss = (Boss)ctx.getBean("boss");
		System.out.println(boss.getName()+" "+boss.getCar()+
				"  "+boss.getOffice());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
