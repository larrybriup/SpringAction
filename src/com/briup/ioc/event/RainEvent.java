package com.briup.ioc.event;

import org.springframework.context.ApplicationEvent;

public class RainEvent extends ApplicationEvent {

	/**
	 * 
	 */
	public RainEvent(Object source) {
		super(source);
		System.out.println("乌云密布、闪电、打雷，紧接着，" + "下起了瓢泼大雨");
	}
}
