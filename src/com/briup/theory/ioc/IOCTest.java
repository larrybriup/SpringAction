package com.briup.theory.ioc;

import com.briup.bean.Teacher;

public class IOCTest {

	public static void main(String[] args) {
		BeanFactory bf = new BeanFactory();
		Teacher t = (Teacher) bf.getBean("teacher");
		System.out.println(t);
	}
}
