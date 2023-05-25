package com.youtube.model;

public class User {

	private String email;
	private String phone;
	private String id;
	private String password;
	private String nickName;
	private char gender;
	
	//기본생성자
	public User() {
	}

	public User(String email, String phone, String id, String password, String nickName, char gender) {
		this.email = email;
		this.phone = phone;
		this.id = id;
		this.password = password;
		this.nickName = nickName;
		this.gender = gender;
	}

	
	//getter setter 만들기
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

	
	
	//toString 만들기
	@Override
	public String toString() {
		return "User [email=" + email + ", phone=" + phone + ", id=" + id + ", password=" + password + ", nickName="
				+ nickName + ", gender=" + gender + "]";
	}
	
	
	
}
