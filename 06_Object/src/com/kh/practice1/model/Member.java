package com.kh.practice1.model;

import java.util.Scanner;

public class Member {

	public int age = 27;
	public char gender = '여';
	public String phone;
	public String email;
	public String memberld;
	public String meberPwd;
	public String memberName = "김예진";
	
	public void changeName(String name) { //매개변수!
		memberName = name;
	}
	public void printName() {
		System.out.println(memberName);
	}
}
