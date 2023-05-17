package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {

	
	public static void main(String[]args) {
		
		OperatorPractice o = new OperatorPractice();
		o.method1();
		o.method2();
		o.method3();
		o.method4();
		o.method5();
		o.method6();
		
		
	}
	
	public void method1() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("연필 개수 : ");
		int num2 = sc.nextInt();
		
		int result1 = num2 / num1;
		int result2 = num2 % num1;
		
		System.out.println("1인당 연필 개수 : " + result1);
		System.out.println("남은 연필 개수 : " + result2);
		
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수를 입력해주세요 > ");
		int num1 = sc.nextInt();
		
		int result = (num1 / 100)*100;
		System.out.println(result);
		
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("입력 1 : ");
		int x = sc.nextInt();
		
		System.out.print("입력 2 : ");
		int y = sc.nextInt();
		
		System.out.print("입력 3 : ");
		int z = sc.nextInt();
		
		System.out.println(x == y && y== z);
		
	    
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num1 = sc.nextInt();
		
		String result = (num1 / 2 == 0) ? "짝수다" :"홀수다";
		System.out.println(result);
	}
	
	public void method5() {
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int num1 = sc.nextInt();
		
		String result = (num1 <= 13) ? "어린이" : (num1 > 13 && num1 <= 19) ? "청소년" : "성인";
		System.out.println(result);
		
	}
	
	public void method6() {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("사과의 개수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("바구니의 크기 : ");
		int num2 = sc.nextInt();
		
		int result = num1 / num2 + (num1 % num2 > 0 ? 1 : 0);
		System.out.println("필요한 바구늬의 수 : " + result);
		
		
		
	}
}
