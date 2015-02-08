package com.briup.aop.after;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.aop.service.AccountServiceImpl;
import com.briup.aop.service.IAccountService;

public class AfterTest {
	@Test
	public void proxyTest(){
		try{
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext
			("com/briup/aop/after/beans.xml");
		IAccountService service = 
				(IAccountService)ctx.getBean("proxy");
			service.bankAction();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
