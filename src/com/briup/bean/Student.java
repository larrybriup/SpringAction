package com.briup.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	private long id;
	private String name;
	private int age;

	private String[] array;
	private List list;
	private Set set;
	private Map map;
	private Properties prop;

	public Student(long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Student() {
		System.out.println("in Student()");
	}

	public void init() {
		System.out.println("in init() of Student");
	}

	public void end() {
		System.out.println("in end() of Student");
	}

	public void show() {

		System.out.println("--------------Array------------");
		for (String s : array) {
			System.out.println(s);
		}

		System.out.println("--------------List------------");
		for (Object o : list) {
			System.out.println(o);
		}

		System.out.println("--------------Set------------");
		for (Object o : set) {
			System.out.println(o);
		}

		System.out.println("--------------Map------------");
		for (Object key : map.keySet()) {
			System.out.println(key + " --> " + map.get(key));
		}

		System.out.println("--------------Properties------------");
		for (Object key : prop.keySet()) {
			System.out.println(key + " --> " + prop.get(key));
		}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
