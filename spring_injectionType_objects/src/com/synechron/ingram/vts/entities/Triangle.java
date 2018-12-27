package com.synechron.ingram.vts.entities;

public class Triangle {
	private Point point_A;
	private Point point_B;
	private Point point_C;

	public Point getPoint_A() {
		return point_A;
	}
	public Point getPoint_B() {
		return point_B;
	}
	public Point getPoint_C() {
		return point_C;
	}
	public void setPoint_A(Point point_A) {
		this.point_A = point_A;
	}
	public void setPoint_B(Point point_B) {
		this.point_B = point_B;
	}
	public void setPoint_C(Point point_C) {
		this.point_C = point_C;
	}
	
	public void draw(){
		System.out.println("Triangle has been drawn with with following 3 points:\n"
				+ "\npoint_a - (x: "+point_A.getX_coordinate()+", y: "+point_A.getY_coordinate()+")"
				+ "\npoint_b - (x: "+point_B.getX_coordinate()+", y: "+point_B.getY_coordinate()+")"
				+ "\npoint_c - (x: "+point_C.getX_coordinate()+", y: "+point_C.getY_coordinate()+")");
	}
}
