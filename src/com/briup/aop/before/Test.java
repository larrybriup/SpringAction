package com.briup.aop.before;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.aop.service.IAccountService;

public class Test {

	@org.junit.Test
	public void aop_beforeAdvice(){
		
		try {
			String path = "com/briup/aop/before/before.xml";
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
