package com.melon.controller;

import java.util.ArrayList;
import java.util.List;

import com.melon.model.Album;
import com.melon.model.Music;
import com.melon.model.User;


public class MusicController {

	User user = null;
	
	ArrayList<Music> musicList   = new ArrayList<>();
	ArrayList<Music> myList = new ArrayList<>();
	
	int index = 0;
	
      // 뮤직 업로드
		public boolean uploadMusic( Music music) {
			
			return musicList.add(music);

		}
		
		// 뮤직리스트 목록
		public ArrayList<Music> printAll() {
			return musicList;
		}
		
		// 뮤직 1개 보기 
		public Music viewMusic(int index) {
			
			return musicList.get(index);
		}
		
		
		// 뮤직 수정  
		public void  updateMusic(int index,Music music) {
			musicList.set(index, music);
		}
		
		//뮤직 맨 첫번째 저장 하기 
		public boolean addatZero(Music music) {
			
			try {
				musicList.add(0, music);
			return true;
			}catch(Exception e) {
				return false;
			}
		}
		
		// 뮤직 선택 삭제 
		public boolean deleteAlbum(String title) {
			
			for(Music music : musicList) {
				if(music.getTitle().equals(title)) {
					return musicList.remove(title);
				}
				
			}
			return false;
			
		}

	
	 // 나의 뮤직리스트 추가 
		public List<Music> addmyMusicList(User user, Music music) {
			
			
			myList.add(music);
			user.setMusics(myList);
			System.out.println("user : " + user);

			return user.getMusics();
		}
		
		// 나의 뮤직리스트 삭제
		public List<Music> deletemyMusicList(User user, Music music){
			user.getMusics().remove(music);
			
			return user.getMusics();
			
		}
		
		// 나의 뮤직리스트 보기
		public List<Music> viewmyMusicList(User user){
			return user.getMusics();
		}
		
}
