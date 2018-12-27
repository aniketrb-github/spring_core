

import org.javabrains.entity.HelloIndia;
import org.javabrains.entity.HelloWorld;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		
		
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
		helloWorld.getMessage1();
		helloWorld.getMessage2();
		
		
		HelloIndia helloIndia = (HelloIndia)context.getBean("helloIndia");
		helloIndia.getMessage1();
			
		/**
		for India -> message2 we haven't defined a equivalent value in XML, therefore it takes that from Instance "helloWorld"
		reason = since attribute - parent="helloWorld" there is a Instance Level inheritance in XML, & NOT class level inheritance
		 */
		helloIndia.getMessage2();						
		helloIndia.getMessage3();
		
		context.close();
	}

}
