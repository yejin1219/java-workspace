package com.kh.practice;

public class IPhone14pro extends SmartPhone implements Pen{

	String name = "iphone 14 Pro";
	String brand = "애플";
	public IPhone14pro() {}

	public void printInformation() {
		 super.printlnformation(name, brand);
		 System.out.println("펜 탑재 여부 : " + pen());
	}

	@Override
	public boolean pen() {
		
		return false;
	}

	@Override
	public String makeCall() {
		
		return "번호를 누르고 통화 버튼을 누름";
	}

	@Override
	public String takeCall() {
		
		return "수신 버튼 누름";
	}

	@Override
	public String picture() {
		
		return "4800만 화소 카메라";
	}
}
