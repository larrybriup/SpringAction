package com.briup.aop.throwException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.aop.service.IAccountService;

public class ThrowTest {
	@Test
	public void throwTest(){
		try {
			String path = "com/briup/aop/throwException/throwing.xml";
			
			ApplicationContext container = 
				new ClassPathXmlApplicationContext(path);
			IAccountService proxy = 
					(IAccountService)container.getBean("proxy");
				proxy.bankAction();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
