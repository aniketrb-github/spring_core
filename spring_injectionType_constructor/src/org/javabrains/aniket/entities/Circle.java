package org.javabrains.aniket.entities;

public class Circle {
	private int radius;
	private String name;
	
	/**
	 * Ctor injection with 'type' attribute usage
	 * 
	 * @param rad
	 * @param name
	 */
	public Circle(int rad, String name) {
		this.radius = rad;
		this.name = name;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void draw(){
		System.out.println(name+" Circle is drawn with radius: "+radius);
	}
	
}
