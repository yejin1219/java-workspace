package com.youtube.impl;

import java.util.ArrayList;

import com.youtube.model.Video;

public interface VideoControllerImpl {

	public void upload(Video video);//영상 업로드

		

	
	public ArrayList<Video> videoList(); //동영상 목록
	
	
	
	public Video viewVideo(int index);  //동영상 1개 보기
	

	
	public void updateVideo(int index, Video video); 
	

	
	public boolean deleteVideo(Video video);
}
