package com.kh.condition;

import java.util.Scanner;

public class A_If {
	
	 Scanner sc = new Scanner(System.in); //인스턴스 변수 

	 /*
	  * if문
	  * 
	  * [표현법]
	  * 
	  * if(조건식){
	  *     ..조건식이 참(true)일 때 실행할 코드..
	  * }
	  * 
	  * - 보통 조건식에는 비교연산자, 논리연산자를 주로 사용
	  * 
	  * */
	 
	 public void method1() {
			
		 int score = 80; //지역변수 
		 
		 // 60점 이상이어야 합격!
		 if(score >= 60){ //의사 코드(슈도코드,pseudocode)
			 System.out.println("합격!");
		 }
		 
//		 if(score >= 60) // {}생략 가능 그러나 {}쓰는 것을 권장!
//			 System.out.println("합격!");
//		     System.out.println("축하드려요!");
		 if(score >= 60) System.out.println("합격!"); // 한줄로 써도 됨
		 
		 // 불합격일 때!
		 if(score < 60)System.out.println("불합격!");
		 
	 } 
	 
	 /*
	  * if-else문
	  * 
	  * [표현법]
	  * 
	  * if(조건식) {
	  *   ... 조건식이 참(true)일 때 실행할 코드..
	  *  } else{
	  *   ... 조건식이 거짓(false)일 때 실행할 코드..
	  *   }
	  * 
	  * */

	 public void method2() {
		 
		 int score = 0;
		 System.out.println("점수 입력 > ");
		 score = sc.nextInt();
		 
		 if(score >= 60) {
			 System.out.println("합격!");
			 
		 }else {
			 System.out.println("불합격!");
		 }
		 
		 //삼항연산자
		 System.out.println((score >= 60)? "합격!" : "불합격!");
	 }
	 
    public void method3(){
    	
		 String name = "";
		 
		 System.out.print("이름을 입력해주세요 > ");
		 name = sc.nextLine();
		 
		 	System.out.println("김예진" == name); // false
		    System.out.println("김예진".equals(name)); // true, String 클래스의 equals()메소드
	        System.out.println("김예진".charAt(0));// String 클래스의 charAt(0)메소드
		 
		 // (ex.) 본인이면 "본인이다.", 본인이 아니라면 "본인이 아니다."
		 
		 if("김예진".equals(name)) {
			 System.out.println("본인이다.");
		 }else {
			 System.out.println("본인이 아니다.");
		 }
	 }
	 
    
    public void method4() {
    	
    	int number = 0;
    	
    	System.out.print("숫자 입력 > ");
    	number = sc.nextInt();
    	
    	//0보다 크면 "양수", 그게 아니면 "음수", 0일 땐 "0입니다."
    	//중첩 if문 : if문 중첩해서 사용 가능!
         if(number > 0) {
        	 System.out.println("양수");
         }else {
//        	 System.out.println("음수");
        	 if( number == 0 ) {
        		 System.out.println("0입니다.");
        	 }else {
        		 System.out.println("음수");
        	 }
        	 
         }
    }
    
    /*
     * if-else if-else문
     * 
     * [표현법]
     * 
     * if(조건식) {
     * 
     *  ..조건식이 참(true)일 때 실행할 코드...
     *  } else if(조건식2){
     *  ..조건식2가 참(true)일 때 실행할 코드...
     *  } else {
     *  ..위에 어느 조건식에도 만족하지 않을 때 실행할 코드..
     *  }
     *  
     *  - else if 수는 제한이 없다. 
     *  - else는 생략이 가능하다. 
     * 
     */
    public void method5() {
    	
    	int number = 0;
    	
    	System.out.print("숫자 입력 > ");
    	number = sc.nextInt();
    	
    	if(number > 0) {
    		System.out.println("양수");
    	}else if(number < 0) {
    		System.out.println("음수");
    	}else {
    		System.out.println("0입니다.");
    	}
    }
    
    
    
    /*
     * 사용자에게 점수(0~100)을 입력받아서 점수별로 등급을 출력하라
     * -90점 이상은 A등급
     * -90점 미만 80점 이상은 B등급
     * -80점 미만 70점 이상은 C등급
     * -70점 미만 60점 이상은 D등급
     * 60점 미만  F등급
     */
    public void method6() {
    	
    	int score = 0;
    	char grade = '\u0000'; //char는 이렇게 초기화 시킴 
    	
    	System.out.print("점수 입력 : ");
    	score = sc.nextInt();
    	
    	if(score >= 90) {
    		grade = 'A';
    	}else if(score >=80) {
    		grade = 'B';
    	}else if(score >=70) {
    		grade = 'C';
    	}else if(score >=60) {
    		grade = 'D';
    	}else {
    		grade = 'F';  // <- System.out.println("F등급");
    	}
    	 System.out.println(grade);
    	
    }
    
    
    /*
     *세 정수를 입력했을 때 짝수만 출력
     *
     * num1 입력 >3
     * num2 입력 >4
     * num3 입력 >6
     * 4
     * 6
     */
    public void practice1() {
    	
    	
    	System.out.print("num1 입력 : ");
    	int num1 = sc.nextInt();
    	System.out.print("num2 입력 : ");
    	int num2 = sc.nextInt();
    	System.out.print("num3 입력 : ");
    	int num3 = sc.nextInt();
    
    	
    	
    	if(num1 % 2 ==0) System.out.print(num1);
    	if(num2 % 2 ==0) System.out.print(num2);
    	if(num3 % 2 ==0) System.out.print(num3);
   	
    }
   
    /*/
     * 
     * 정수 1개를 입력했을 때 음(minus)/양(plus)/0(zero), 짝(even)/홀(odd) 출력
     * 정수입력 > -3
     * minus
     * odd
     */
    public void practice2() {
    	
    	
    	System.out.print("정수 입력 : ");
    	int num1 = sc.nextInt();
    	
    	if(num1 > 0) {
    		System.out.println("plus");
    		if(num1 %2 ==0 ) {
    			System.out.println("even");
    		}else {
    			System.out.println("odd");
    		}
    		
    		//System.out.println((num1 % 2== 0)? "even" : "odd");//삼항연산자 
    		
    		
    	}else if(num1 < 0) {
    		System.out.println("minus");
    		System.out.println((num1 % 2== 0)? "even" : "odd");
    	}else {
    		System.out.println("zero");
    	}
    }
    
   
    
	 public static void main(String[] args) {

		A_If a = new A_If();
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
//		a.method5();
//		a.method6();
		
//		a.practice1();
		a.practice2();
		
		
	}
	 



}
