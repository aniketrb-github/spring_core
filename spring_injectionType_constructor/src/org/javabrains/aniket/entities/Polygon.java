package org.javabrains.aniket.entities;

public class Polygon {
	private int side1;
	private int side2;
	private int side3;
	private int side4;
	
	/**Constructor Injection with 'index' attribute usage
	 * 
	 * we've used index attribute tag in XML, where indexing is done from 0,1,2...
	 * simply the values are assigned as per the indexes mentioned in XML
	 * perfect match needed for this, i.e [No. of args in XML == no of args in ctor param list]
	 */
	public Polygon(int s1,  int s2, int s3, int s4) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
		this.side4 = s4;
	}
	
	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	public int getSide3() {
		return side3;
	}
	public void setSide3(int side3) {
		this.side3 = side3;
	}
	public int getSide4() {
		return side4;
	}
	public void setSide4(int side4) {
		this.side4 = side4;
	}
	public void draw(){
		System.out.println("Polygon is drawn with side1: "+side1+", side2: "+side2+", side3: "+side3+", side4: "+side4);
	}
	
}
