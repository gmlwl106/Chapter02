package com.javaex.ex12;

public class Person {
	
	//필드
	protected String name;
	protected int age;
	
	
	//생성자
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	//메소드 gs
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	
	//메소드 일반
	public void showInfo() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}
	
	
	
}
