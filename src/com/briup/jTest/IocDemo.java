package com.briup.jTest;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.briup.bean.Student;
import com.briup.bean.Teacher;

public class IocDemo {
	@Test
	public void ioc_set(){
		
		try {
			//要读取的xml文件路径(可能有多个文件要读取)
			//如果要读取多个xml文件,我们就可以声明一个String类型数组,把多个路径放进数组
			String path = "com/briup/ioc/set/set.xml";
			
			/*//创建一个spring容器对象(相当于工厂类的一个对象)
			ApplicationContext container = 
					new ClassPathXmlApplicationContext(path);
			*/
			Resource resource = 
					new ClassPathResource(path);
				
				// spring容器
				BeanFactory container = 
					new XmlBeanFactory(resource);
			//从容器中拿对象
			Teacher t = (Teacher)container.getBean("teacher");
			
			//查看对象和对象之间的依赖关系是否已经建立好
			System.out.println(t.getStudent());
			
			System.out.println("------------------------");
			Student s1 = (Student)container.getBean("student");
			Student s2 = (Student)container.getBean("student");
			System.out.println(s1);
			System.out.println(s2);
			System.out.println("--------------------------");
			Student stu = (Student)container.getBean("s2");
			System.out.println(stu.getId());
			System.out.println(stu.getName());
			System.out.println(stu.getAge());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void ioc_collection(){
		try {
			String[] path = 
				{"com/briup/ioc/collection/"
						+ "collection.xml"};
			ClassPathXmlApplicationContext 
			container = 
	new ClassPathXmlApplicationContext(path);
			
			Student s = (Student)
					container.getBean("student");
			s.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void ioc_import(){
		try {
			/*String[] path = 
				{"com/briup/ioc/imp/teacher.xml",
							 "com/briup/ioc/imp/student.xml"};*/
			String path = "com/briup/ioc/imp/import.xml";
			ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext(path);
			
			Teacher t = (Teacher)container.getBean("teacher");
			
			System.out.println(t.getStudent());
			System.out.println(t.getStudent().getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void ioc_extend(){
		try {
			String path = "com/briup/ioc/extend/extends.xml";
			ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext(path);
			
			Teacher t = (Teacher)container.getBean("t");
			
			System.out.println(t.getStudent());
			System.out.println(t.getId());
			System.out.println(t.getName());
			System.out.println(t.getStudent().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void ioc_life(){
		try {
			String path = "com/briup/ioc/life/life.xml";
			ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext(path);
			
			Student s1 = (Student)container.getBean("student");
//			Student s2 = (Student)container.getBean("student");
			container.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void ioc_constructor(){
		try {
			String path = "com/briup/ioc/constructor/constructor.xml";
			/*ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext(path);*/
			Resource resource = new ClassPathResource(path);
			BeanFactory container = new XmlBeanFactory(resource);
			
			Student s = (Student)container.
					getBean("student");
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getAge());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void ioc_autowired(){
		try {
			String path = "com/briup/ioc/autowired/autowired.xml";
			ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext(path);
			
			Teacher t = (Teacher)container.
					getBean("teacher");
			System.out.println(t.getName());
			System.out.println(t.getStudent());
			System.out.println(t.getStudent().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
