package com.melon.model;

import java.util.List;

public class User {
	private String email;
	private String phone;
	private String id;
	private String password;
	private String nickName;
	private String address;
	private List<Music> musics;
	
	
	
	public User() {
		super();
		
	}
	
	
	public User(String email, String phone, String id, String password, String nickName, String address,
			List<Music> musics) {
		super();
		this.email = email;
		this.phone = phone;
		this.id = id;
		this.password = password;
		this.nickName = nickName;
		this.address = address;

		this.musics = musics;
		
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<Music> getMusics() {
		return musics;
	}
	public void setMusics(List<Music> musics) {
		this.musics = musics;
	}
	
	@Override
	public String toString() {
		return "User [email=" + email + ", phone=" + phone + ", id=" + id + ", password=" + password + ", nickName="
				+ nickName + ", address=" + address +  ", musics=" + musics + "]";
	}

	

}
