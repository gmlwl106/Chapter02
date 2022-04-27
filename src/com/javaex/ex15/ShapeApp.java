package com.javaex.ex15;

public class ShapeApp {
	public static void main(String[] args) {

		/*
		Shape s01 = new Shape("빨강", "검정");
		System.out.println(s01.toString());
		*/
		
		Rectangle[] rArray = new Rectangle[2];
		rArray[0] = new Rectangle("빨강","검정",4,6);
		rArray[1] = new Rectangle("파랑","검정",7,7);
		for(int i=0; i<rArray.length; i++) {
			System.out.println(rArray[i].toString());
		}
		
		Triangle[] tArray = new Triangle[2];
		tArray[0] = new Triangle("빨강","검정",4,4);
		tArray[1] = new Triangle("보라","검정",10,10);
		for(int i=0; i<rArray.length; i++) {
			System.out.println(tArray[i].toString());
		}
		
		Circle[] cArray = new Circle[2];
		cArray[0] = new Circle("보라","빨강",3);
		cArray[1] = new Circle("보라","검정",3);
		for(int i=0; i<cArray.length; i++) {
			System.out.println(cArray[i].toString());
		}
		
	}
}
