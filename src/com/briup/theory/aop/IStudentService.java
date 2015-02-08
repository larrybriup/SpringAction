package com.briup.theory.aop;


public interface IStudentService {
	
	void save(Student s);
	
	void delete(long id);
	
	Student find(long id);
	
}
