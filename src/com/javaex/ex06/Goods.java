package com.javaex.ex06;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() { //기본(default)생성자
		//*****메모리에 올리는일을 함(클래스를 인스턴스화)*****
	}
	
	public Goods(String name) {
		//*****메모리에 올리는일을 함(클래스를 인스턴스화)*****
		//추가로직
		this.name = name;
	}
	
	public Goods(String name, int price) {
		//*****메모리에 올리는일을 함(클래스를 인스턴스화)*****
		//추가로직
		this.name = name;
		this.price = price;
	}
	
	
	//메서드 -gs
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//메서드 - 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
}
