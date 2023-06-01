package com.youtube.controller;

import com.youtube.model.User;

public interface UserControllerImpl {

	//<기능>
			// 로그인
			public boolean login();
			// 회원가입
			public boolean signUp();
			// 프로필 보기
			public User viewProfile(); 
			// 프로필 수정
			public User updateProfile();
			// 계정 삭제
			public boolean deleteProfile();
}
