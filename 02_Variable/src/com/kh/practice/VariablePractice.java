package com.kh.practice;

import java.util.Scanner;
public class VariablePractice {

	
	// FQCN(Fully Qualified Class Name)
	// 클래스가 속한 패키지명을 모두 포함한 이름
 public static void main(String[] args) {
		
     
	VariablePractice vp = new VariablePractice();
//	   vp.method1();
//       vp.method2();
//       vp.method3(); 
       vp.method4();
	
 }
	
	public void method1 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번쨰 정수를 입력하세요 :");
		int num1 = sc.nextInt();
		
		
		System.out.print("두 번쨰 정수를 입력하세요 :");
		int num2 = sc.nextInt();
		
		  System.out.println("더하기 결과 : " + (num1 + num2));
		  System.out.println("뺴기 결과 : " + (num1 - num2));
		  System.out.println("곱하기 결과 : " + (num1 * num2));
		  System.out.println("나누기 몫 결과 : " + (num1 / num2));
			
 }


    public void method2 () {
    	 
    	
    }

    public void method3 () {
    	
    	 int x = 5;
    	 int z = 9;
    	 int y = 7;
    	 int tmp;
    	 
    	 tmp = y;   
    	 y = z;   
    	 z = x;
    	 x = tmp;
    	 
    	 System.out.println("x= : " + x);
    	 System.out.println("y= : " + y);
    	 System.out.println("z= : " + z);
    	 
    	}
    
    public void method4 () {
    	Scanner sa = new Scanner(System.in);
    	System.out.print("문자열을 입력하세요 :");
    	String num3 = sa.nextLine();
    	
    	
    	System.out.print("첫번째 문자 :" );
    	String num4 = sa.nextLine();
    	char ch = num4.charAt(0);
    
    	
    	System.out.print("마지막 문자 :" );
    	String num5 = sa.nextLine();
    	char cb = num5.charAt(1);
    	
    	
    }
    
   }