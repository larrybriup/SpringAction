package com.briup.theory.ioc;

import java.util.Map;


public class BeanFactory {
	
	private Map<String,Object> map;
	
	public BeanFactory(String path){
		try {
			init(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public BeanFactory() {
		this("src/com/briup/theory/ioc/bean.xml");
	}
	private void init(String path)throws Exception{
		
		map = BeanFactoryHelper.parseXML(path);
		
	}
	
	public Object getBean(String beanName) {
		
		return map.get(beanName);
	}

}
