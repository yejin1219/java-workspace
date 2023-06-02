package com.kh.practice1;

public class C_UnCheckedException {

	
	/*
	 * UnCheckedException
	 * - RuntimeExecption을 상속하고 있는 예외들
	 * - 컴파일 시 예외 처리 코드가 있는지 검사하지 않는 예외
	 * - 프로그램 실행할 때 문제가 발생되는 것으로 조건문들을 통해서 처리가 가능 
	 * 
	 * */
	public static void main(String[] args) {
		
		
		C_UnCheckedException c = new C_UnCheckedException();
//		c.method1();
//		c.method2();
//		c.method3();
		c.method4();

	}
	
	//ArrayIndexOutOfBoundsException
	public void method1() {
		//배열의 접근에 잘못된 인덱스 값을 사용하는 경우 예외 발생 
		String [] str = {"Hello Java", "No I mean It", "Nice meet you"};
		
		int i = 0;
		while(i<=3) {
		
//			System.out.println(str[i]); //0,1,2,3
//			i++; <__이걸 아래 로직으로 에러를 잡아줌 
			
           try {
        	   System.out.println(str[i]); //0,1,2,3
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
           i++;
		}
	}
	
	///NegativeArraySizeException
	public void method2() {

	//배열 크기를 음수로 지정한 경우 예외 발생
	
//	 int[]arr = new int[-3]; 
	 
		try {
			int [] arr = new int[-3];
		}catch(NegativeArraySizeException e) {
			System.out.println(e.getMessage()); // -3
		}
	 
	}
	
	// ArithmeticException
	public void method3() {
		//나누기 연산에서 분모가 0인 경우 예외 발생
//		int result = 10/0;   //Exception in thread "main" java.lang.ArithmeticException: / by zero 라고 에러 발생
		
		
		try {
			int result = 10/0;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage()); // / by zero 
		} finally {
			System.out.println("예외발생 여부와 상관없이 무조건 수행");
		}
	}
	
	//NullPointerException
	public void method4() {
		//Null인 참조 변수로 객체의 멤버 참조 시도 시 예외 발생.
//		String str = null;
//		System.out.println(str.length());  // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
		
		
		String str = null;
		try {
			System.out.println(str.length());
		}catch(NullPointerException e) {// <--Exception e 이렇게 해도 가능 
			System.out.println(e.getMessage());
		}
		
		
	}
}
