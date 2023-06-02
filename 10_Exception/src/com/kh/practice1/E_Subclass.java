package com.kh.practice1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class E_Subclass extends E_SuperClass {
//1.
//	@Override
//	public void method() {
//		//오버라이딩 시 throws 작성하지 않아도 됨
//	}
	
	
//2.	
//	@Override
//	public void method() throws IOException{
//		//부모 클래스의 메서드와 같은 Exception을 throws 하는 것은 가능 
//	}

//3.	
//	@Override
//	public void method() throws Exception{
//		//부모 클래스의 메서드보다 더 상위 타입의 Exception을 throws 하는 것을 불가능 
//	}
	
	
	@Override
	public void method() throws FileNotFoundException {
		//부모 클래스의 메서드보다 더 하위 타입의 Exception을 throws 하는 것은 가능 
	}
}
