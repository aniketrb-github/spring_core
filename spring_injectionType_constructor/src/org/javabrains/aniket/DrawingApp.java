package org.javabrains.aniket;


import org.javabrains.aniket.entities.Circle;
import org.javabrains.aniket.entities.Polygon;
import org.javabrains.aniket.entities.Rectangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	@SuppressWarnings("resource")
	public static void main(String args[]){
		
		/**Constructor Injection : Type-1
		 * xml file contains <constuctor-arg> tag with simply values in it.
		 * spring populates those values into the ctor when a perfect match is found for no. of args in arg list 
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Rectangle rectangle = (Rectangle)context.getBean("rectangle");
		rectangle.draw();
		
		Circle circle = (Circle)context.getBean("circle");
		circle.draw();
		
		Polygon polygon = (Polygon)context.getBean("polygon");
		polygon.draw();		
	}
}
