package com.melon.model;

import java.util.Date;

public class Album {

	public String title;
	public String singer;
	public String musicList;
	public String comment;
	public String imgUrl;
	public String fileUrl;
	public Date uploadAt;
	
	
	
	public Album() {
	}



	public Album(String title, String singer, String musicList, String comment, String imgUrl, String fileUrl,
			Date uploadAt) {
		this.title = title;
		this.singer = singer;
		this.musicList = musicList;
		this.comment = comment;
		this.imgUrl = imgUrl;
		this.fileUrl = fileUrl;
		this.uploadAt = uploadAt;
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



	public String getMusicList() {
		return musicList;
	}



	public void setMusicList(String musicList) {
		this.musicList = musicList;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public String getImgUrl() {
		return imgUrl;
	}



	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}



	public String getFileUrl() {
		return fileUrl;
	}



	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}



	public Date getUploadAt() {
		return uploadAt;
	}



	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}



	@Override
	public String toString() {
		return "Album [title=" + title + ", singer=" + singer + ", musicList=" + musicList + ", comment=" + comment
				+ ", imgUrl=" + imgUrl + ", fileUrl=" + fileUrl + ", uploadAt=" + uploadAt + "]";
	}
	
	
	    
		

}
