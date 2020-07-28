package com.blc.beans;

public class Rectangle {
	private int width;
	private int height;
	private int area;
	
	public Rectangle(int width) {
		this.width=width;
		System.out.println("construactoe injection");
		
	}
	public void setHeight(int height) {
		this.height=height;
		System.out.println("Setter Injection");
	}
	
	public void init() {
		this.area = this.width*this.height;
		System.out.println(area);
		System.out.println("Inetialisation Logic");
	}

	public void cleanUp() {
		area = 0;
		System.out.println("Destruction Logic");
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", area=" + area + "]";
	}
	
}
