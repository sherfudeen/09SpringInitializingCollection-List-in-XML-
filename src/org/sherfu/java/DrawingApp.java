package org.sherfu.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Triangle tri = new Triangle();
		tri.draw();
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle springTriangle = (Triangle) factory.getBean("triangle");
		springTriangle.draw();
		*/

		ApplicationContext appCon = new ClassPathXmlApplicationContext("spring.xml");
		Triangle springTriangle = (Triangle) appCon.getBean("triangle");
		springTriangle.draw();
		
	}

}
