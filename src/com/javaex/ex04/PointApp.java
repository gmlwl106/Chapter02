package com.javaex.ex04;

public class PointApp {
	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.setX(5);
		p1.setY(5);
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		
		Point p3 = new Point(10, 20);
		
		Point p4 = new Point(100);
		p4.setY(200);
		
		
		p1.draw();
		p2.draw();
		p3.draw(true);
		p4.draw(false);
	}
}
