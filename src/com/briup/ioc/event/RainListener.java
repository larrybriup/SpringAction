package com.briup.ioc.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class RainListener 
implements ApplicationListener{

	@Override
	public void onApplicationEvent
	(ApplicationEvent event) {
		if(event instanceof RainEvent){
			System.out.println("唐僧大喊："+
		event.getSource()+"赶快收衣服喽！");
	
		}
	}
}
