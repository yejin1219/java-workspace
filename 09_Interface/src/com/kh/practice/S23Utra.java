package com.kh.practice;

public class S23Utra extends SmartPhone implements Pen{

	String name = "S23 Ultra";
	String brand = "삼성";
	
	public S23Utra() {}

  public void printInformation() {
		
	  super.printlnformation(name, brand);
		 System.out.println("펜 탑재 여부 : " + pen());
	}

@Override
public boolean pen() {
	
	return true;
}

@Override
public String makeCall() {
	
	return "번호를 누르고 통화버튼 누름 "; 
}

@Override
public String takeCall() {
	
	return "수신 버튼을 누름";
}

@Override
public String picture() {
	
	return "2억 화소 카메라 ";
}

	
}
