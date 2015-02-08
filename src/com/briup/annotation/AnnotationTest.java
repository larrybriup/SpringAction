package com.briup.annotation;

import java.text.SimpleDateFormat;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.briup.annotation.pojo.User;
import com.briup.annotation.service.UserService;

public class AnnotationTest {
	@Test
	public void proxyTest(){
		try{
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext
			("com/briup/annotation/bean.xml");
		UserService service= 
			(UserService) ctx.getBean("userService");
		User user= new User();
		user.setUserName("choda");
		user.setGender(true);
		user.setAge(23);
		user.setBirthDate(new SimpleDateFormat("yyyy-MM-dd").parse("1990-01-14"));
		service.save(user);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
