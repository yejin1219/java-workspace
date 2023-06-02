package com.kh.practice1;

import java.io.IOException;

public class B_Throws {

	/*
	 * 예외처리 떠넘기기
	 * 
	 * [표현법]
	 * 
	 * 리턴타입 메서드명(매개변수,...) throws 예외 클래스1, 예외 클래스2,...{
	 * 
	 * }
	 * 
	 */
	
	public static void main(String[] args) {
		
		try {
			new B_Throws().method1(); //6. 객체 생성해서 method1() 호출 하면 에러 발생 --> try~ catch로 .02에러 잡음 
//			                                                                       메인메서드로 에러 또 떠넘길 수도 있는데 메인메서드안에서는 try~catch 이용하여 에러 잡기 
		} catch (ClassNotFoundException e) { //<= 가장 하위 Exception e 클래스가 맨 위로 ( 여기에서 처럼 여러 catch로 Exception클래스 사용해서 에러 잡을 때)
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}catch(Exception e) { //<= 가장 하위 Exception e 클래스가 맨 아래로 ( 여기에서 처럼 여러 catch로 Exception클래스 사용해서 에러 잡을 때)
			
			e.printStackTrace();
		}
		
	}
	
	public void method1() throws ClassNotFoundException, IOException {// 5. 구현부에서 에러난 것을 throws 사용해서 method1()으로 떠넘기기 
		                        //throws Exception 이렇게 하나만 적어줘도 다 예외 떠 넘길 수도 있음 (Exception이 가장 큰 조상이기 때문 )
		System.out.println("method1() 호출");
		
		method2(); //4.에러남
		
		
		System.out.println("method1() 종료");
		
	}
	
	public void method2() throws IOException, ClassNotFoundException{ // 3. 구현부에서 에러난 것을 throws 사용해서 method2()으로 떠넘기기 
		System.out.println("method2() 호출");
		
		method3(); //2.에러남
		
		
		System.out.println("method2() 종료");
	}
	
	public void method3() throws IOException, ClassNotFoundException { // 1. 구현부에서 에러난 것을 throws 사용해서 method3()으로 떠넘기기 
		System.out.println("method3() 호출");
		
		int random = (int)(Math.random()*3 + 1);
		
		if(random == 1) {
			throw new ClassNotFoundException(); //0. 여기서 에러 남(고의적으로 에러 발생하게 만듦)
		}else if(random == 2) {
			throw new IOException(); //0. 여기서 에러 남(고의적으로 에러 발생하게 만듦)
		}
		System.out.println("method3() 종료");
	}
}
