package com.javaex.ex03;

public class GoodsApp {
	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		/*
		System.out.println(camera.getName());
		
		int cameraPrice = camera.getPrice();
		System.out.println(cameraPrice);
		
		System.out.println("상품이름:" + camera.getName() + ", 가격:" + camera.getPrice());
		System.out.println("상품이름:" + computer.getName() + ", 가격:" + computer.getPrice());
		System.out.println("상품이름:" + cup.getName() + ", 가격:" + cup.getPrice());
		*/
		
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
		
		//camera.name은 private로 설정 되어있기 때문에 사용할 수 없음
	}
}
 