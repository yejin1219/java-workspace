package com.kh.array.practice2.controller;

import java.util.Arrays;

import com.kh.array.practice2.model.Member;

public class MemberController {

	private Member [] mrr = new Member[3];
	public int count;
	
	//2번의 경우 
	public void insertMember(Member m) {
		
		this.mrr[count++] = new Member(m.getId(), m.getName(), m.getPassword(),
				                         m.getEmail(), m.getGender(), m.getAge());
		
		// this.m[count++] = m;		<- 이렇게 해도 됨 
				
	   }
	
	public boolean updateMember(String id, String name, String password,String email) {
		//checkId활용 <-- index
		//추가처럼 수정도 같은 방식 해당 인덱스 값에 넣은 방식
		// setter 이용
		int index = this.checkld(id);
		if(index!=-1) {
			mrr[index].setName(name);
			mrr[index].setPassword(password);
			mrr[index].setEmail(email);
			return true;
		}
		
		return false;
	}
	
	public int checkld(String id) {
		// 객체 배열 값들 for문 돌려서 일치한지 확인해서 리턴 값
		for(int i = 0; i<mrr.length; i++) {
			if(mrr[i]!=null && mrr[i].getId().equals(id)) {
				return i;
			} 
		} return -1;
		
	}
	
	public Member[] printAll() {
		return mrr;
	}
	
}

  