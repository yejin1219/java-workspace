package com.melon.model;

import java.util.List;

public class User {
	private String email;
	private String phone;
	private String id;
	private String password;
	private String nickName;
	private String address;
	private char gender;
	
	
	private List<Album> albums;

	public User() {
		
	}
	

	public String getEmail() {
		return email;
	}

	public User(String email, String phone, String id, String password, String nickName, String address, char gender,
			 List<Album> albums) {
		super();
		this.email = email;
		this.phone = phone;
		this.id = id;
		this.password = password;
		this.nickName = nickName;
		this.address = address;
		this.gender = gender;
		
		this.albums = albums;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	
	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}

	


}
