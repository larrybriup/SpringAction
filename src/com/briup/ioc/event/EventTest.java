package com.briup.ioc.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventTest {
	public static void main(String[] args) {
		ApplicationContext context =
			new ClassPathXmlApplicationContext
			("com/briup/ioc/event/applicationContext.xml");
			context.publishEvent
			(new RainEvent("下雨了！"));
	}
}
