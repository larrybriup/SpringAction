package com.briup.ioc.life;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.bean.LifeBean;
import com.briup.bean.MyBean;

public class LifeTest {
	@Test
	public void ioc_life(){
		String path = "com/briup/ioc/life/life.xml";
		ClassPathXmlApplicationContext container = 
			new ClassPathXmlApplicationContext(path);
		LifeBean bean = (LifeBean)container.
				getBean("lbean");
		LifeBean bean1 = (LifeBean)container.
				getBean("lbean");
		System.out.println("=============");
		container.getBean("lb");
		container.getBean("lb");
		//System.out.println(bean);
		container.destroy();
		
	}
}
