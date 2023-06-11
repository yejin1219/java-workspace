package com.melon.impl;

import com.melon.model.User;

public interface UserControllerlmpl {

	//로그인
	public boolean login(); 
	
	//회원가입
	public void signUp();

	//회원정보 수정
    public User updateInformation();

	//프로필 설정 
    public User settingProfile();

	//간편결제 관리
    public User settingPay();

	//계정 삭제 
    public void deleteInformation();
}
