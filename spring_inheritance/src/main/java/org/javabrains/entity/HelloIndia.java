package org.javabrains.entity;

public class HelloIndia {
	private String message1;
	private String message2;
	private String message3;
	public String getMessage1() {
		System.out.println("HelloIndia_msg1: "+message1);
		return message1;
	}
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	public String getMessage2() {
		System.out.println("HelloIndia_msg2: "+message2);
		return message2;
	}
	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	public String getMessage3() {
		System.out.println("HelloIndia_msg3: "+message3);
		return message3;
	}
	public void setMessage3(String message3) {
		this.message3 = message3;
	}
}
