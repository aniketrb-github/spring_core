package com.synechron.ingram.vts.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.synechron.ingram.vts.entities.Triangle;

public class DrawingApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/**
		 * Object Injection Demo
		 * Triangle entity depends on the Point entity
		 * Firstly, Spring creates all the 3 point entities & injects them into the Triangle Pojo
		 * then since the Triangle's dependency is fulfilled, triangle entity is created & draw() is executed 
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
	}

}
