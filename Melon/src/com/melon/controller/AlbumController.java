package com.melon.controller;

import java.util.ArrayList;

import com.melon.model.Album;
public class AlbumController {

	
	
	ArrayList<Album> albumlist = new ArrayList<>();
	int index = 0;
	
	     // 앨범 업로드
			public boolean uploadAlbum(Album album) {
				return albumlist.add(album);
	
			}
			
			// 앨범 목록
			public ArrayList<Album> printAll() {
				return albumlist;
			}
			
			// 앨범 1개 보기 
			public Album viewAlbum(int index) {
				
				return albumlist.get(index);
			}
			
			
			// 앨범 수정  
			public void  updateAlbum(int index,Album album) {
				albumlist.set(index, album);
			}
			
			//앨범 맨 첫번째 저장 하기 
			public boolean addatZero(Album album) {
				
				try {
				albumlist.add(0, album);
				return true;
				}catch(Exception e) {
					return false;
				}
			}
			
			// 앨범 선택 삭제 
			public boolean deleteAlbum(String title) {
				
				for(Album album : albumlist) {
					if(album.getTitle().equals(title)) {
						return albumlist.remove(title);
					}
					
				}
				return false;
				
			}

}			
