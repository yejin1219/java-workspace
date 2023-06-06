package com.kh.practice1.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.practice1.compare.ArtistAscending;
import com.kh.practice1.compare.TitleAscending;
import com.kh.practice1.model.Music;

public class MusicController {

	ArrayList <Music> list = new ArrayList();
	
	
	
	public boolean addList(Music music) {
		

		
		return list.add(music);
		
	}
	
	public boolean addAtZero(Music music) {
		
		try{
			list.add(0, music);
			return true; 
		}catch(Exception e) {
			return false; 
		}
		
	}
	
	public  ArrayList<Music> printAll (){
		
		return list;
		
		

	}
	
	public  Music searchMusic(String title) {
		
		for(Music music : list) {
			if(music.getTitle().contains(title)) {
				return music;
			}
		} return null;
	}
	
    public  Music removeMusic(String title) {
//		for(Music music :list) {
//			if(music.getTitle().equals(title)) { //정확하게 일치 하도록 equals 씀
//				list.remove(music); //()안에 객체가 들어가 있어서 리턴타입이 boolean 
//				 return music;
//			}
//		}
    	
    	
    	for(int i =0; i<list.size(); i++) {
    		if(list.get(i).getTitle().equals(title)) {
    			return list.remove(i); //i는 인덱스 값, 해당 인덱스가 가리키는 객체 제거 (리턴타입:객체)
    		}
    	}
    	
    	
		return null;
	}
    
    public Music setMusic(String title, Music music) {
    	for(Music music1 :list) {
			if(music1.getTitle().equals(title)) {
				return list.set(list.indexOf(music1),music);
			}
		}return null;
    	
    }
    
    public ArrayList<Music> ascTitle(){
    	ArrayList<Music> list =(ArrayList<Music>) this.list.clone(); //깊은 복사, (ArrayList<Music>)로 형 변환
    	//오름차순
    	Collections.sort(list, new TitleAscending());
    	return list;
		
    }
    
    public  ArrayList<Music> descArtist(){
    	
    	ArrayList<Music> list =(ArrayList<Music>) this.list.clone();
    	//내림차순
    	Collections.sort(list,new ArtistAscending().reversed());
    	return list;
    }
	
	
}
