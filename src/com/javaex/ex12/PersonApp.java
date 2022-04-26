package com.javaex.ex12;

public class PersonApp {
	public static void main(String[] args) {
		
		Person p01 = new Person("박희지", 29);
		p01.showInfo();
		
		//Student s01 = new Student("서울고등학교");

		/*
		Student s02 = new Student();
		s02.setName("박희지");
		s02.setAge(29);
		s02.setSchoolName("서울대학교");
		System.out.println(s02.toString());
		*/
		
		Student s1 = new Student("서울고등학교");
		s1.showInfo();
		
		Student s2 = new Student("박희지", 19, "한국고등학교");
		s2.showInfo();
	}
	
}
