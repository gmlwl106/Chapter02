package com.javaex.ex20;

public class MyFileApp {
	public static void main(String[] args) {
		
		MyFile mf = new MyFile();
		/*
		String str = mf.read("myFile.txt");
		System.out.println(str);
		*/
		
		/*
		String str = mf.read2("myFile.txt");
		System.out.println(str);
		*/
		
		try {
			String str = mf.read3("myFile.txt");
		} catch (Exception e) {
			System.out.println("**************");
			System.out.println("*파일이없습니다*");
			System.out.println("**************");
		}
		
		
	}
}
