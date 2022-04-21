package com.javaex.ex04;

public class Song {

	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	//생성자
	
	
	//메소드-gs
	//Setter
	public void setTitle(String songTitle) {
		title = songTitle;
	}
	public void setArtist(String songArtist) {
		artist = songArtist;
	}
	public void setAlbum(String songAlbum) {
		album = songAlbum;
	}
	public void setComposer(String songComposer) {
		composer = songComposer;
	}
	public void setYear(int songYear) {
		year = songYear;
	}
	public void setTrack(int songTrack) {
		track = songTrack;
	}
	
	//Getter
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getAlbum() {
		return album;
	}
	public String getComposer() {
		return composer;
	}
	public int getYear() {
		return year;
	}
	public int getTrack() {
		return track;
	}
	

	//메소드-일반
	public void showInfo() {
		System.out.println(artist + ", " + title + " ( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡 )");
	}
	
	
	
}
