package com.kh.practice.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.practice.compare.ArtistAscending;
import com.kh.practice.compare.TitleAscending;
import com.kh.practice.model.Music;
public class MusicController {

 ArrayList <Music> list = new ArrayList();
	
	
	
	public boolean addList(Music music) {
		return list.add(music);

	}
	
	public boolean addAtZero(Music music) {
		if(music != null ) {
			list.add(0, music);
			return true;
		}else return false;
		
		
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
    	for(Music music : list) {
			if(music.getTitle().equals(title)) {
				list.remove(music);
				return music;
			}
				
			
    	} return null;
    }
    	
    	
		
    
    public Music setMusic(String title, Music music) {
    	for(Music music1 : list) {
			if(music1.getTitle().equals(title)) {
				return list.set(list.indexOf(music1), music);
			}
    	} return null;
    }
    
    public ArrayList<Music> ascTitle(){
    	
    	ArrayList<Music> list = (ArrayList<Music>)this.list.clone();
    	Collections.sort(list, new TitleAscending());
    	return list;
    	
    	
    }
    
    public  ArrayList<Music> descArtist(){
    	ArrayList<Music> list = (ArrayList<Music>)this.list.clone();
    	Collections.sort(list,new ArtistAscending());
    	return list;
    }
}
    
    

