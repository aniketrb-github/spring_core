package org.aniket.javabrains;

public class Triangle {
	
	private String type;
	
	// we're gonna set this value to class attribute via Ctor Inject type
	private int height;

	/**
	 * "Constructor Injection"
	 * <constructor-arg value="Equilateral"> tag in XML indicates the usage of Constructor Injection Type
	 * that value is injected here to this Constructor
	 * 
	 * @param type
	 */
	public Triangle(String type) {
		this.type = type;
	}
	
	/** Constructor Injection - with multiple args
	 * Spring searches for a Ctor with 2arguments & if found then, sets the values to it  
	 * 
	 * @param type
	 * @param height
	 */
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}
	
	/** Spring's "Setter Injection"
	 * Spring reads the 'type' property value from classPath XMLfile &
	 * Injects the value into the class attribute via the "setter" method of the POJO
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public int getHeight() {
		return height;
	}

	public void draw(){
		System.out.println("\""+this.type+"\" Triangle Drawn with height = "+this.height);
	}
}
