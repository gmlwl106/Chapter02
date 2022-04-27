package com.javaex.ex14;

public class ShapeApp {
	public static void main(String[] args) {
		
		/*
		Ractangle r01 = new Ractangle("빨강","검정",4,4);
		Ractangle r02 = new Ractangle("주황","검정",5,5);
		Triangle t01 = new Triangle("빨강","검정",4,4);
		Triangle t02 = new Triangle("보라","검정",10,10);
		Circle c01 = new Circle("보라","빨강",3);
		Circle c02 = new Circle("보라","검정",3);
		
		r01.draw();
		r02.draw();
		t01.draw();
		t02.draw();
		c01.draw();
		c02.draw();
		*/
		
		Ractangle[] rArray = new Ractangle[2];
		rArray[0] = new Ractangle("빨강","검정",4,4);
		rArray[1] = new Ractangle("주황","검정",5,5);
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		Triangle[] tArray = new Triangle[2];
		tArray[0] = new Triangle("빨강","검정",4,4);
		tArray[1] = new Triangle("보라","검정",10,10);
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		Circle[] cArray = new Circle[2];
		cArray[0] = new Circle("보라","빨강",3);
		cArray[1] = new Circle("보라","검정",3);
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
	}
}
