package com.melon.model;

public class User {
	public String email;
	public String phone;
	public String id;
	public String password;
	public String nickName;
	public String address;
	public char gender;
	
	
	public User() {
	}


	public User(String email, String phone, String id, String password, String nickName, String address, char gender) {
		this.email = email;
		this.phone = phone;
		this.id = id;
		this.password = password;
		this.nickName = nickName;
		this.address = address;
		this.gender = gender;
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


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "User [email=" + email + ", phone=" + phone + ", id=" + id + ", password=" + password + ", nickName="
				+ nickName + ", address=" + address + ", gender=" + gender + "]";
	}
	
	
	


}
