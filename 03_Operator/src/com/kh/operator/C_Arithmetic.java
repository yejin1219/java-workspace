package com.kh.operator;

public class C_Arithmetic {

	
	/*
	 * 
	 * 산술 연산자
	 * 
	 * 
	 *  + (더하기)
	 *  - (빼기0
	 *  * (곱하기)
	 *  / (나누기)
	 *  % (나머지)
	 *  
	 *  
	 */
	
	
	public static void main(String[] args) {
		
		C_Arithmetic c = new C_Arithmetic();
		c.method1();
		c.method2();
	}
	
	public void method1() {
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));//13
		System.out.println("num1 - num2 = " + (num1 - num2)); //7
		System.out.println("num1 * num2 = " + (num1 * num2));//30
		System.out.println("num1 / num2 = " + (num1 / num2));//3 (나누기 했을 때의 몫:3)
		System.out.println("num1 % num2 = " + (num1 % num2));//1 (나누기 했을 때의 나머지:1)
		
	}
	
	public void method2() {
		
		int a = 5;
		int b = 10;
		int c = (++a) + b; // a=6,c=16, b=10
		int d = c/a; //a=6, b=10, c=16, d=2
		int e = c % a; // a=6, b=10, c=16 = d=2, e=4
		int f = e++; // a=6, b=10, c=16 = d=2, e=5, f=4
		int g = (--b) + (d--); // 11=9+2 a=6, b=9, c=16 = d=1, e=5, f=4, g=11
		int h = 2;
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h); // 6 + 3*10%8 = 6+30%8 =6+6 =12 / a=7, b=9, c=15, d=1, e=6, f=4, g=10, i=12
		
		System.out.println("f : " + f); //4
		System.out.println("i : " + i); //12
		
		
		
		
	}
}
