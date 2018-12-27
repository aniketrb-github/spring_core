package org.javabrains.aniket.entities;

public class Rectangle {
	private int length;
	private int breadth;
	private String name;
	
	/**
	 * Ctor injection i.e Plain type
	 - xml file contains tags <constructor-arg> with values in them
	 - spring searches for the equivalent ctor in POJO, 
	 - it maps the no. of arguments provided in xml with the ctor argument list in POJO
	 - if it finds it, directly all values are been initialized to the class attributes 
	  
	 * @param length
	 * @param breadth
	 */
	public Rectangle(int length, int breadth, String name) {
		this.length = length;
		this.breadth = breadth;
		this.name = name;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void draw(){
		System.out.println(name+" Rectangle with length: "+length+" breadth: "+breadth+" is been drawn.");
	}
}
