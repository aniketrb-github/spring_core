package org.aniket.javabrains.entities;

public class Triangle {
	
	// commonPoint will be accessible to all the other beans
	private Point commonPoint;
	
	// point_B 7 point_C will be internal to Triangle
	private Point point_B;
	private Point point_C;
	
	public Point getCommonPoint() {
		return commonPoint;
	}
	public void setCommonPoint(Point commonPoint) {
		this.commonPoint = commonPoint;
	}
	public Point getPoint_B() {
		return point_B;
	}
	public void setPoint_B(Point point_B) {
		this.point_B = point_B;
	}
	public Point getPoint_C() {
		return point_C;
	}
	public void setPoint_C(Point point_C) {
		this.point_C = point_C;
	}
	
	public void draw(){
		System.out.println("Triangle has been drawn with with following 3 points:\n"
				+ "\npoint_a - (x: "+commonPoint.getX()+", y: "+commonPoint.getY()+")"
				+ "\npoint_b - (x: "+point_B.getX()+", y: "+point_B.getY()+")"
				+ "\npoint_c - (x: "+point_C.getX()+", y: "+point_C.getY()+")");
	}
}
