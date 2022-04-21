package com.javaex.ex04;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	
	//생성자
	
	
	//메소드 - gs
	public void setX(int pointX) {
		x = pointX;
	}
	
	public void setY(int pointY) {
		y = pointY;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	//메소드 - 일반
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
	
	
}
