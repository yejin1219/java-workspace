package com.melon.impl;

import com.melon.model.Album;

public interface AlbumControllerlmpl {

	 
	         // 앨범 업로드
				public Album upload(); 
				
				// 앨범 목록
				public Album[] albumList();
				
				// 앨범 1개 보기 
				public Album viewAlbum();
				
				
				// 앨범 수정  
				public Album  updateAlbum();
				
				
				// 앨범 삭제 
				public boolean deleteAlbum();
}
