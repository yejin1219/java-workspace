package com.melon.impl;

import java.util.ArrayList;

import com.melon.model.Album;

public interface AlbumControllerlmpl {

	 
	            // 앨범 업로드
				public boolean uploadAlbum(Album album); 
				// 앨범 목록
				public ArrayList<Album> printAll();
				// 앨범 1개 보기 
				public Album viewAlbum(int index);
				// 앨범 수정  
				public void  updateAlbum(int index,Album album);
				//앨범 맨 첫번째 저장 하기 
				public boolean addatZero(Album album);
				// 앨범 선택 삭제 
				public boolean deleteAlbum(String title);
}
