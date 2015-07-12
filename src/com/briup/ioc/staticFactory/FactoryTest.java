package com.briup.ioc.staticFactory;

import java.sql.Connection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryTest {
	@Test
	public void ioc_instanceFactory(){
		String path ="com/briup/ioc/staticFactory/staticFactory.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		Connection conn = (Connection)ctx.getBean("conn");
		System.out.println(conn);
	}
}
