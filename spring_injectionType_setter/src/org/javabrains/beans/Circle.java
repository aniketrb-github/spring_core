package org.javabrains.beans;

public class Circle {
	private int radius;
	private int diameter;

	public int getRadius() {
		return radius;
	}
	public int getDiameter() {
		return diameter;
	}
	
	/**Setter Injection
	 * These setter methods act as the setter injections for Spring Container.
	 * Spring gets the values from the Xml file <property> tag, & injects it into class attributes via setter methods
	 * 
	 * @param radius
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	
	
	public void draw(){
		System.out.println("Circle Drawn of radius: "+this.radius+" & diameter of circle is: "+this.diameter);
	}
	
}
