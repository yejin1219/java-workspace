package com.kh.example.practice4.controller;

import com.kh.example.practice4.model.Snack;

/*
 * controller : 사용자가 화면에서 요청한 부분을 처리하는 기능 담당
 * 이때 처리 후에 결과를 여기서 출력하는게 아니라 결과값을 다시 view
 * 다시 view에 반환하여 view에서 처리하도록 해야 함 
 */
public class SnackController {

	
	private Snack s1 = new Snack();
	
	public SnackController() {}
	
	
	
	
	// 데이터를 setter를 이용해 저장하고 저장 되었다는 결과를 반환하는 메서드
	public boolean saveData(Snack s1) {// 참조형 매개변수 사용 = s1의 주소를 복사 
		
		this.s1.setKind(s1.getKind());
		this.s1.setName(s1.getName());
		this.s1.setFlavor(s1.getFlavor());
		this.s1.setNumOf(s1.getNumOf());
		this.s1.setPrice(s1.getPrice());
		
		
		
		
		
//		this.s1.setKind(s1.getKind());
//		this.s1.setName(s1.getName());
//		this.s1.setFlavor(s1.getFlavor());
//		this.s1.setNumOf(s1.getNumOf());
//		this.s1.setPrice(s1.getPrice());
		
		return true;
	}
	
	//저장된 데이터를 반환하는 메서드
	public Snack confirmData() {
		return this.s1;
	}
	
	
}
