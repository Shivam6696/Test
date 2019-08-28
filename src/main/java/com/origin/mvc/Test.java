package com.origin.mvc;

//import org.springframework.beans.factory.BeanFactory;
///import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;


public class Test {
	@SuppressWarnings({ "resource" })
	public static void main(String arg[]) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee emp= (Employee) context.getBean("e");
		emp.show();
	}

}
