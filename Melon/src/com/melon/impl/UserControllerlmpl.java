package com.melon.impl;

import com.melon.model.User;

public interface UserControllerlmpl {

	//로그인 
	public boolean login(String id, String password); 
	
	//회원가입
    public boolean signUp(String id, User user);

    //패스워드 바꾸기
    public boolean changePassword(String id, String oldpw, String newpw);
    
    
    //닉네임 바꾸기 
    public boolean changeNickname(String id, String pasword, String oldNickname, String newNickname);
  
	//계정 삭제 
    public boolean deleteInformation(User user);
}
