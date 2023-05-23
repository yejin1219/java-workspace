package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.array.B_Dimension;

public class ArrayPractice {
	
	public static void main(String[] args) {

		ArrayPractice a =new ArrayPractice();
//		a.method1();
//		a.method2();
//		a.method3();
		a.method4();
//		a.method5();
	}
	
	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 * */
	public void method1() {
		
		String [] fruit = new String [5];
		
		fruit[0] = "사과";
		fruit[1] = "딸기";
		fruit[2] = "자몽";
		fruit[3] = "파인애플";
		fruit[4] = "수박";
		
		System.out.println(fruit[1]);
		
	}
	
	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로
	 * 초기화 한 후
	 * 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5
	 * 배열 0번째 인덱스에 넣을 값 : 4  //배열 [0] = 4
	 * 배열 1번째 인덱스에 넣을 값 : -4 //배열 [1] = -4
	 * 배열 2번째 인덱스에 넣을 값 : 3 //배열 [2] = 3
	 * 배열 3번째 인덱스에 넣을 값 : -3 //배열 [3] = -3
	 * 배열 4번째 인덱스에 넣을 값 : 2 //배열 [4] = 2
	 * [4, -4, 3, -3, 2]
	 * 2
	 * */
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int [] arr = new int[num];
		
		for(int i= 0; i<arr.length; i++) {
			System.out.print("배열" + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();	
			sum+=arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);

	}
	
	
	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서
	 * 사용자가 입력한 값이
	 *  배열에 있으면 "배달 가능", 없으면 "배달 불가능"을 
	 *  출력하세요.
	 * 
	 * */
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] menu = {"피자", "치킨", "떡볶이", "라면", "닭발", "족발"};
		
		System.out.print("메뉴를 입력하세요 : ");
		String str = sc.nextLine();
		
		outer:
		for(int i = 0; i < menu.length; i++) {
			if(str.equals(menu[i])) {
				System.out.println("배달 가능");
				break outer;
			}else System.out.println("배달 불가능");
			 break outer;
		}
	}
	
	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요.
	 * 단, 원본 배열은 건드리지 않고! (깊은 배열)
	 * 
	 * 주민등록번호 : 123456-1234567 
	 * 123456-1******
	 * 
	 * */
	public void method4() {
		Scanner  sc = new Scanner(System.in);
		int i =0;
		System.out.print("주민등록번호 : ");
		String str = sc.nextLine();
		
		
		char [] ch = str.toCharArray();
		
		
		char[] copy = null;
		copy = ch.clone();
		
		for(i=8; i<copy.length;i++) {
			copy [i] = '*';
		}
		
		for(char c : copy) {
			System.out.print(c);
		}
		  
	}
	
	
	
	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요. 
	 * 
	 * 단어 입력 : programming
	 * gnimmargorp
	 * 11 / 인덱스 범위 0~10
	 * */
	public void method5() {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("단어 입력 : ");
		String str = sc.nextLine();
		
		char [] ch = str.toCharArray(); //str.length()=11 
		
		char [] copy = null;
		copy = ch.clone(); 
				
		for(int i=ch.length-1; i>=0;i--) {
			copy [i] = ch[ch.length-1-i];
		}

		for(char c : copy) {
			System.out.print(c);
		}

	}
	
}
