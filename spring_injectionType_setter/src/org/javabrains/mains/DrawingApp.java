package org.javabrains.mains;

import org.javabrains.beans.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		/**
		 	Setter Injection Demo
		 - xml contains bean
		 - bean contains properties
		 - properties represent the corresponding class attributes in POJO which have name & value predefined in XML
		 - these values are binded by spring to the class attributes i.e a preset operation
		 */
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Circle circle = (Circle)context.getBean("circle");
		circle.draw();
	}

}
