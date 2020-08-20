package com.engine.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
	
	public static void main(String[]args) {
		 //BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/engine/common/application-context.xml"));
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/engine/common/application-context.xml");
		 Engine engine = context.getBean("engine",Engine.class);
		 System.out.println(engine);
	}

}
