package com.melon.model;

public class Music {

	public String title;
	public String singer;
	public String imgUrl;
	
	
	public Music() {
		
		
	}
	public Music(String title, String singer) {
		
		this.title = title;
		this.singer = singer;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + ", imgUrl=" + imgUrl + "]";
	}
	
	
}
