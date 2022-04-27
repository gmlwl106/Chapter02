package com.javaex.ex16;

public class ShapeApp {
	public static void main(String[] args) {

		
		Shape s = new Shape("빨강", "노랑");
		
		Rectangle r = new Rectangle("빨강", "검정", 5, 5);
		System.out.println(r.getHeight());//자식메소드 사용가능
		
		//메모리에는 다 올라가고 부모쪽만 보인다.
		Shape sr = new Rectangle("빨강", "검정", 15, 15);
		//System.out.println(sr.getHeight()); //자식메소드를 사용할수없다
		
		
		//Shape 배열에 모든 도형을 담아서 관리하고 싶다
		
		//Shape 배열 생성
		Shape[] sArray = new Shape[6];
		
		//사각형2
		Shape r01 = new Rectangle("빨강", "검정", 4, 4);
		Shape r02 = new Rectangle("초록", "검정", 20, 4);
		
		//원2
		Shape c01 = new Circle("보라", "분홍", 6);
		Shape c02 = new Circle("검정", "분홍", 8);
		
		//삼각형2
		Shape t01 = new Triangle("갈색", "노랑", 7, 9);
		Shape t02 = new Triangle("빨강", "노랑", 5, 5);
		
		//배열에 도형 담기
		sArray[0] = r01;
		sArray[1] = r02;
		sArray[2] = c01;
		sArray[3] = c02;
		sArray[4] = t01;
		sArray[5] = t02;
		
		for(int i=0; i<sArray.length; i++) {
			//오버라이딩
			sArray[i].draw();
			System.out.println("넓이는 " + sArray[i].area() + "입니다.");
		}
		
		((Rectangle)sArray[0]).getHeight();
		
		
		
		
		
	}
}
