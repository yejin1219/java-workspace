package com.practice.controller;

import com.practice.model.Member;
public class MemberController {

	

		private Member [] mrr = new Member[3];
		public int count;
		
		
		public void insertMember(Member m) {
			
			this.mrr[count++] = m;
			
					
		   }
		
		public boolean updateMember(String id, String name, String password,String email) {
			
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
			for(int i=0; i<mrr.length; i++) {
				if(mrr[i] != null && mrr[i].getId().equals(id)) {
					return i;
				} 
			} return -1;
		}
		
		public Member[] printAll() {
			return mrr;
		}
		
	}
