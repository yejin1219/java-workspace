package com.youtube.controller;

import com.youtube.model.Video;

public interface VideoControllerImpl {

	// 영상 업로드
		public Video upload(); 	
		// 영상 목록
		public Video[] videoList();
		// 영상 1개 보기
		public Video viewVideo();
		// 동영상 수정 
		public Video updateVideo();
		// 동영상 삭제 
		public boolean deleteVideo();
}
