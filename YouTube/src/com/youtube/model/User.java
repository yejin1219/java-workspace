package com.youtube.model;

import java.util.List;

public class User {

	private String email;
	private String phone;
	private String id;
	private String password;
	private String nickName;
	private char gender;
	
	private List<Video> vidieos; // 한 사람이 여러개 비디오를 가질 수 있다. 

	public String getEmail() {
		return email;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public List<Video> getVidieos() {
		return vidieos;
	}

	public void setVidieos(List<Video> vidieos) {
		this.vidieos = vidieos;
	}
	
	
	
	
}
