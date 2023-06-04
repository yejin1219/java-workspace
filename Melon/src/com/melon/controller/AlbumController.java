package com.melon.controller;

import com.melon.model.Album;

public class AlbumController {

	Album albumList [] = new Album[5];
	int index = 0;
	
	// 앨범 업로드
			public void upload(Album album) {
				albumList [index++] = album;
	
			}
			
			// 앨범 목록
			public Album[] albumList() {
				return albumList;
			}
			
			// 앨범 1개 보기 
			public Album viewAlbum(int index) {
				
				return albumList[index];
			}
			
			
			// 앨범 수정  
			public void  updateAlbum(int index,Album album) {
				albumList[index] = album;
			}
			
			
			// 앨범 삭제 
			public boolean deleteAlbum() {
				return false;
			}
}
