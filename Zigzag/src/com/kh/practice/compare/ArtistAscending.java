package com.kh.practice.compare;

import java.util.Comparator;

import com.kh.practice.model.Music;

public class ArtistAscending implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		return o1.getArtist().compareTo(o2.getArtist());
	}

}
