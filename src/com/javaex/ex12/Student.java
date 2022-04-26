package com.javaex.ex12;

public class Student extends Person {
	
	//필드
	private String schoolName;

	
	
	
	//생성자
	public Student() {
	}
	public Student(String schoolName) {
		this.schoolName = schoolName;
	}
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}

	
	//메소드 gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	
	//메소드 일반
	
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", name=" + this.getName() + ", age=" + this.getAge() + "]";
	}
	
	public void showInfo() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("학교:"+schoolName);
	}
	
}
