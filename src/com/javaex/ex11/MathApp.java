package com.javaex.ex11;

public class MathApp {
	public static void main(String[] args) {
		
		/* 메소드를 static으로 생성했기 때문에 인스턴스를 반복해서 만들 필요 없음
		Math math = new Math();
		System.out.println(math.plus(3, 2));
		System.out.println(math.plus(3.2, 6.6));
		*/
		
		System.out.println(Math.plus(3, 2));
		System.out.println(Math.plus(3.2, 6.6));
		System.out.println(Math.circleArea(5));
	}
}
