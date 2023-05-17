package com.kh.practice;
import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] args) {
		
		CastingPractice ca  = new CastingPractice();
		
		 ca.method1();
		 ca.method2();
		
	}
	
	public void method1 () {
		
		Scanner ac = new Scanner(System.in);
		
		System.out.print("문자 :");
		String num1 = ac.nextLine();
		char ch = num1.charAt(0);
		
		System.out.println("A unicode : " + (int)ch);
		System.out.println("B unicode : " + (ch+1));
		
		
	
	}
	public void method2 () {
		
		Scanner ab = new Scanner(System.in);
		
		System.out.print("국어 :");
		int num2 = ab.nextInt();
		
		System.out.print("수학 :");
		int num3 = ab.nextInt();
		
		System.out.print("영어 :");
		int num4 = ab.nextInt();
		
		
		int sum = (num2 + num3 + num4);
		float average = (float)(num2 + num3 + num4)/3;
		
		System.out.printf("총점 :%d\n평균 :%.2f", sum, average);
	}
	
}
