package com.spring.core.entity;

/**
 * The most recommended way to handle the spring beans life cycle 
 * @author abharsa
 */
public class Department {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Department() {
		System.out.println("classDepartment Ctor Invoked.");
	}
	
	public void customInit() {
		System.out.println("classDepartment customInit() invoked.");
	}
	
	public void customDestroy() {
		System.out.println("classDepartment: customDestroy() is invoked. Bean clean-off code to be written here.");
	}
}
