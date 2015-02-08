package com.briup.theory.aop.dynamicProxy;

public class StudentServiceImpl 
implements IStudentService{
	public void delete(long id) {
		//开启事务
		System.out.println("student is deleted...");
		//提交事务
	}

	public Student find(long id) {
		//开启事务
		System.out.println("student is found...");
		//提交事务
		return null;
	}

	public void save(Student s) {
		//开启事务
		System.out.println("student is saved...");
		//提交事务
	}
}
