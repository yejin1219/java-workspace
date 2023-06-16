package com.melon.impl;

import java.util.ArrayList;
import java.util.List;

import com.melon.model.Music;
import com.melon.model.User;

public interface MusicControllerImpl {

	public boolean uploadMusic( Music music);
	
	// 뮤직리스트 목록
	public ArrayList<Music> printAll();
	
	// 뮤직 1개 보기 
	public Music viewMusic(int index);
	
	
	// 뮤직 수정  
	public void  updateMusic(int index,Music music);
	
	//뮤직 맨 첫번째 저장 하기 
	public boolean addatZero(Music music);
	
	// 뮤직 선택 삭제 
	public boolean deleteAlbum(String title);


 // 나의 뮤직리스트 추가 
	public List<Music> addmyMusicList(User user, Music music);
	
	// 나의 뮤직리스트 삭제
	public List<Music> deletemyMusicList(User user, Music music);
	
	// 나의 뮤직리스트 보기
	public List<Music> viewmyMusicList(User user);
	
}
