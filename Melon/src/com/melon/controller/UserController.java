package com.melon.controller;

import java.util.HashMap;

import com.melon.model.User;
public class UserController {

	User user = null;
	private HashMap<String,User> map = new HashMap<>();
	
	
	        //회원정보 보기 
	         public User viewUserInfo(String id) {
	    	  if(map.containsKey(id)) {
	    		  return map.get(id);
	    	  }
	    	  return null;
	          }
	   
	
	        //로그인
			public boolean login(String id, String password) {
				if(map.containsKey(id) && map.get(id).getPassword().equals(password) ) {

				return true;
				}
				
				return false;
			}
			
			//회원가입
		    public boolean signUp(String id, User user) {
		    	if(!map.containsKey(id)) {
		    		map.put(id, user);
		    		return true;
		    	}
		    	return false;
			}  

		    //패스워드 바꾸기
		    public boolean changePassword(String id, String oldpw, String newpw) {
		    	
		    	if(map.containsKey(id) && map.get(id).getPassword().equals(oldpw)) {
		    		map.get(id).setPassword(newpw);
		    		
		    		return true;
		    	}
		    	return false;
		    }
		    
		    
		    //닉네임 바꾸기 
		    public boolean changeNickname(String id, String pasword, String oldNickname, String newNickname) {
		    	
		    	if(map.containsKey(id) && map.get(id).getPassword().equals(pasword)) {
		    		map.get(id).setNickName(newNickname);
		    	
		    		return true;
		    	}
		    	
		    	return false;
		    }
		    
		  
			
		    

			//계정 삭제 
		    public boolean deleteInformation(User user) {
		    	if(map.containsKey(user)) {
		    		map.remove(user);
		    		return true;
		    	}
		    	return false;
		    }
		    
		    
		  
		    
		    
		    
}
