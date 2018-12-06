package com.spring.core.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * this bean uses the callback interfaces such as BeanNameAware, BeanFactoryAware, ApplicationContextAware
 * Even this is not recommended due its tight coupling to application code
 * @author abharsa
 */
public class Address implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {
	private String city;

	public Address() {
		System.out.println("classAddress: Address Ctor is invoked.");
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("classAddress: setApplicationContext() invoked. ");
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("classAddress: setBeanFactory() invoked. Is the Address bean singleton? : "+beanFactory.isSingleton("address") );
	}

	public void setBeanName(String beanName) {
		System.out.println("classAddress: setBeanName() invoked. Bean name is: "+beanName);
	}
}
