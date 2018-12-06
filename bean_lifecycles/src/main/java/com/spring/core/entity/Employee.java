
package com.spring.core.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * This bean uses the InitializingBean and DisposbleBean callback interfaces
 * Not recommended since its a java coding format & is binded to application tightly due to this reason
 * @author Aniket Bharsakale
 */
public class Employee implements InitializingBean, DisposableBean {

	private String name;
	
	public Employee() {
		System.out.println("classEmployee Ctor: bean created by Spring ApplicationContext container.");
	} 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void destroy() throws Exception {
		System.out.println("classEmployee: destroy() invoked.");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("classEmployee: afterPropertiesSet() invoked.");
	}
	
}
