package com.javaex.ex19;

public class Ex02 {
	public static void main(String[] args) {
		
		int[] intArray = new int[] {3, 6, 9};
		
		try {
			System.out.println(intArray[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally");
		}
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
	}
}
