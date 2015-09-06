package com.briup.test;

import java.sql.Connection;
import java.util.Map;
import java.util.TreeMap;

import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.briup.bean.LifeBean;
import com.briup.bean.Student;
import com.briup.bean.Teacher;
import com.briup.ioc.annotation.Boss;
import com.briup.ioc.property_editor.Address;
import com.briup.ioc.property_editor.AddressEditor;
import com.briup.ioc.property_editor.Person;

@SuppressWarnings("deprecation")
public class IOCTest {

	private ClassPathXmlApplicationContext container;

	@After
	public void After() {
		if (container != null) {
			container.close();
			container.destroy();
		}
	}

	@Test
	public void ioc_set() {

		// 要读取的xml文件路径(可能有多个文件要读取)
		// 如果要读取多个xml文件,我们就可以声明一个String类型数组,把多个路径放进数组
		String path = "com/briup/ioc/set/set.xml";

		/*
		 * //创建一个spring容器对象(相当于工厂类的一个对象) ApplicationContext container = new
		 * ClassPathXmlApplicationContext(path);
		 */
		Resource resource = new ClassPathResource(path);

		// spring容器
		BeanFactory container = new XmlBeanFactory(resource);
		// 从容器中拿对象
		Teacher t = (Teacher) container.getBean("teacher");
		// 查看对象和对象之间的依赖关系是否已经建立好
		System.out.println(t.getStudent());

		System.out.println("---------prototype---------------");
		Student s1 = (Student) container.getBean("student");
		Student s2 = (Student) container.getBean("student");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("s1.equals(s2) = " + s1.equals(s2));
		System.out.println("--------------------------");

		Student stu = (Student) container.getBean("s2");
		System.out.println(stu);
	}

	@Test
	public void ioc_collection() {
		String[] path = { "com/briup/ioc/collection/" + "collection.xml" };
		container = new ClassPathXmlApplicationContext(path);

		Student s = (Student) container.getBean("student");
		s.show();
	}

	@Test
	public void ioc_import() {
		/*
		 * String[] path = {"com/briup/ioc/imp/teacher.xml",
		 * "com/briup/ioc/imp/student.xml"};
		 */
		String path = "com/briup/ioc/imp/import.xml";
		container = new ClassPathXmlApplicationContext(path);

		Teacher t = (Teacher) container.getBean("teacher");

		System.out.println(t.getStudent());
	}

	@Test
	public void ioc_extend() {
		String path = "com/briup/ioc/extend/extends.xml";
		container = new ClassPathXmlApplicationContext(path);

		Teacher t = (Teacher) container.getBean("teacher");

		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getStudent());
	}

	@Test
	public void ioc_life() {
		String path = "com/briup/ioc/life/life.xml";
		container = new ClassPathXmlApplicationContext(path);

		System.out.println("====================singleton================================");
		LifeBean singletonBean1 = (LifeBean) container.getBean("singleton_bean");
		LifeBean singletonBean2 = (LifeBean) container.getBean("singleton_bean");
		LifeBean singletonBean3 = (LifeBean) container.getBean("singleton_bean");
		System.out.println("singletonBean1.equals(singletonBean2) = " + singletonBean1.equals(singletonBean2));
		System.out.println("singletonBean1.equals(singletonBean3) = " + singletonBean1.equals(singletonBean3));

		System.out.println("\n====================prototype================================");
		LifeBean prototypeBean1 = (LifeBean) container.getBean("prototype_bean");
		LifeBean prototypeBean2 = (LifeBean) container.getBean("prototype_bean");
		System.out.println("prototypeBean1.equals(prototypeBean2) = " + prototypeBean1.equals(prototypeBean2));
	}

	@Test
	public void ioc_constructor() {
		String path = "com/briup/ioc/constructor/constructor.xml";
		/*
		 * ClassPathXmlApplicationContext container = new
		 * ClassPathXmlApplicationContext(path);
		 */
		Resource resource = new ClassPathResource(path);
		BeanFactory container = new XmlBeanFactory(resource);

		Student s = (Student) container.getBean("student");
		System.out.println(s);
	}

	@Test
	public void ioc_autowired() {
		String path = "com/briup/ioc/autowired/autowired.xml";
		container = new ClassPathXmlApplicationContext(path);

		Teacher teacher = (Teacher) container.getBean("teacher");
		System.out.println(teacher);
	}

	@Test
	public void ioc_instanceFactoryBean() {
		String path = "com/briup/ioc/factory_bean/factory-bean.xml";
		container = new ClassPathXmlApplicationContext(path);
		Connection conn = (Connection) container.getBean("conn");
		System.out.println(conn);
	}

	@Test
	public void ioc_instanceFactory() {
		String path = "com/briup/ioc/factory/factory.xml";
		container = new ClassPathXmlApplicationContext(path);
		Connection conn = (Connection) container.getBean("conn");
		System.out.println(conn);
	}

	@Test
	public void ioc_instanceStaticFactory() {
		String path = "com/briup/ioc/factory_static/static-factory.xml";
		container = new ClassPathXmlApplicationContext(path);
		Connection conn = (Connection) container.getBean("conn");
		System.out.println(conn);
	}

	@Test
	public void ioc_propertyEditorTest() {
		String path = "com/briup/ioc/property_editor/property-editor.xml";
		container = new ClassPathXmlApplicationContext(path);
		// (new String[]{"com/briup/ioc/property_editor/plugin.xml",
		// "com/briup/ioc/property_editor/property-editor.xml"});
		Person person = (Person) container
						.getBean("person");
		System.out.println(person);
	}

	@Test
	public void ioc_propertyEditorTest2() throws InstantiationException, IllegalAccessException,
					ClassNotFoundException, IllegalArgumentException {
		CustomEditorConfigurer config = new CustomEditorConfigurer();
		Map<String, String> customerEditorMap = new TreeMap<String, String>();
		customerEditorMap.put("com.briup.ioc.property_editor.Address",
						"com.briup.ioc.property_editor.AddressEditor");
		config.setCustomEditors(customerEditorMap);

		Person person = new Person();
		person.setId(1);
		person.setName("kevin");
		person.setAge(25);
		String address = "kunshan:xueyuan.rd:China";

		String addressEditorClass = customerEditorMap.get("com.briup.ioc.property_editor.Address");
		AddressEditor addressEditor = (AddressEditor) Class.forName(addressEditorClass).newInstance();
		addressEditor.setAsText(address);
		person.setAddress((Address) addressEditor.getValue());
		System.out.println(person);
	}
	
	@Test
	public void ioc_annotation() {
		container = new ClassPathXmlApplicationContext("com/briup/ioc/annotation/annotation.xml");
		Boss boss = (Boss) container.getBean("boss");
		System.out.println(boss);
	}

}
