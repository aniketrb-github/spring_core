package org.aniket.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		/*
		// creating object in traditional way, which are tied to the Main class
		// SCS
		// Triangle triangle = new Triangle();
		// triangle.draw();
		*/
		
		/** BeanFactory with XmlBeanFactory 
		 * BeanFactory gets the Bean by reading the XML file through XmlBeanFactory
		 * It reads the XML from the root location of the application 
		*/
		/* 
		BeanFactory factory = new XmlBeanFactory( new FileSystemResource("root_spring.xml"));
		Triangle triangle = (Triangle)factory.getBean("triangle");
		triangle.draw();
		*/
		
		/**	ApplicationContext with ClassPathXmlApplicationContext
		 * AppCtx is more advanced than BeanFactory BUT they achieve the same functionality of creating & getting the beans
		 * It reads the XML file from the classPath of the Application
		 * Setter Injection & Constructor Injection experimented here in POJO
		*/
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath_spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
		
	}

}
