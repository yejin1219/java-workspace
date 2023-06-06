package com.kh.practice.compare;

import java.util.Comparator;

import com.kh.practice.model.Music;

public class TitleAscending implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
}
