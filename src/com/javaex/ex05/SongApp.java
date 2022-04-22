package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song iu = new Song("좋은날","아이유","Real","이민수",2010,3);		
		
		Song bigbang = new Song("거짓말","BIGBANG","Always","G-DRAGON",2007,2);		
		
		Song busker = new Song("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준",2012,4);

		
		System.out.println(iu.toString());
		System.out.println(bigbang.toString());
		System.out.println(busker.toString());
	}

}
