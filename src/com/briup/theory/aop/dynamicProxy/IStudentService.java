package com.briup.theory.aop.dynamicProxy;

import com.briup.bean.Student;


public interface IStudentService {
	
	void save(Student s);
	
	void delete(long id);
	
	Student find(long id);
	
}
