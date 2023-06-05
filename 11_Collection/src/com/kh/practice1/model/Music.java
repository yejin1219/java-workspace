package com.kh.practice1.model;

public class Music {

	String title;
	String artist;
	
	
	
	public Music() {
		super();
		
	}
	
	
	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
	@Override
	public String toString() {
		return artist + " - " + title;
	}
	
	
	
	
}
