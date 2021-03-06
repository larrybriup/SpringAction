package com.briup.theory.ioc;

import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class BeanFactoryHelper {

	public static Map<String, Object> parseXML(String path) throws Exception {
		
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, TempValue> temp = new HashMap<String, TempValue>();

		SAXReader reader = new SAXReader();

		Document document = reader.read(new File(path));

		Element rootElement = document.getRootElement();

		List<Element> beans = rootElement.elements();

		for (Element bean : beans) {

			String beanName = bean.attributeValue("name");
			String className = bean.attributeValue("class");

			Object o = Class.forName(className).newInstance();
			map.put(beanName, o);

			List<Element> properties = bean.elements();
			for (Element property : properties) {
				String propertyName = property.attributeValue("name");
				String refName = property.attributeValue("ref");

				TempValue tv = new TempValue(propertyName, refName);
				temp.put(beanName, tv);
			}
		}

		for (String beanName : temp.keySet()) {
			TempValue tv = temp.get(beanName);
			String propertyName = tv.getPropertyName();
			String refName = tv.getRefName();

			// t.setStudent(s);
			Object o = map.get(beanName);
			Object args = map.get(refName);

			// "setStudent" Method
			String methodName = getMethodName(propertyName);

			Class clazz = o.getClass();

			Method m = clazz.getMethod(methodName, args.getClass());
			// t.setStudent(s);
			m.invoke(o, args);
		}
		return map;
	}

	private static String getMethodName(String s) {
		s = s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
		return "set" + s;
	}

}
