package com.melon.controller;

import com.melon.model.User;

public class UserController {

	User user = null;
	
			public boolean login(String id, String password) {
				if(this.user!=null && user.getId().equals(id) && user.getPassword().equals(password)) {
					return false;
				}
				
				return true;
			}
			
			//회원가입
		    public void signUp(User user) {
		    	this.user = user;
			}

			//회원정보 수정(로그인이 된 경우)
		    public User updateInformation(User user) {
		    	if(login(this.user.getId(), this.user.getPassword())) {
		    		this.user = user;
		    	}
		    	return this.user;
			}

			//프로필 설정 
		    public User settingProfile(User user) {
		    	
		    	if(login(this.user.getId(), this.user.getPassword())) {
		    		this.user.setNickName(user.nickName);
		    	}
		    	
		    	return null;
			}

			//간편결제 관리
		    public boolean settingPay(User suer) {
		    	if(login(this.user.getId(),this.user.getPassword())) {
		    		return true;
		    	}
		    	return false;
		    }

			//계정 삭제 
		    public void deleteInformation(String id) {
		    	if(this.user.getId().equals(id)) {
		    		user=null;
		    	}
		    	return;
		    }
}
