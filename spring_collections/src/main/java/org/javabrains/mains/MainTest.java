package org.javabrains.mains;

import org.javabrains.collections.JavaCollections;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		
		JavaCollections collections = (JavaCollections)context.getBean("javaCollection");
		collections.getAddressList();
		collections.getAddressSet();
		collections.getAddressMap();
		collections.getAddressProp();
		
		context.close();
	}

}
