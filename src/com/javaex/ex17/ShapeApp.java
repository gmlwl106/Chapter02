package com.javaex.ex17;


public class ShapeApp {
	public static void main(String[] args) {

		/*Shape이 추상클래스가 되었기 때문에 인스턴스화 할수없음
		Shape s = new Shape("빨강", "파랑");
		*/
		Rectangle r = new Rectangle("빨강", "파랑", 4, 4);
		
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
			sArray[i].draw();
			System.out.println(sArray[i].area());
		}
	}
}
