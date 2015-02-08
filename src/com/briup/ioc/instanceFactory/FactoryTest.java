package com.briup.ioc.instanceFactory;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryTest {
	@org.junit.Test
	public void ioc_instanceFactory(){
		String path ="com/briup/ioc/instanceFactory/instanceFactory.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		Connection conn = (Connection)ctx.getBean("conn");
		System.out.println(conn);
	}
}
