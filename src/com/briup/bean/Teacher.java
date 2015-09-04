package com.briup.bean;

public class Teacher {

	private long id;
	private String name;
	private Student student;

	public Teacher() {
		System.out.println("in Teacher()");
	}

	public Teacher(long id, String name, Student student) {
		this.id = id;
		this.name = name;
		this.student = student;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", student in teacher = " + student + "]";
	}

}
