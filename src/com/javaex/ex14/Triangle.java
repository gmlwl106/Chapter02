package com.javaex.ex14;

public class Triangle extends Drawing {
	
	//필드
	private int width;
	private int height;


	//생성자
	public Triangle() {
		
	}
	public Triangle(String fillColor, String lineColor,int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}
	
	
	
	//메소드 gs
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	//메소드 일반
	public void draw() {
		System.out.println("면색:"+super.fillColor+", 선색:"+super.lineColor+", 가로:"+width+", 세로:"+height+" 삼각형을 그렸습니다.");

	}
	
	
	
}
