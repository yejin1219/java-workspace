package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;

public class Run {

	public static void main(String[] args) {

//		Snack s1 = new Snack(); 클래스 snack과 Run클래스 연결해주는 것
		SnackController scr = new SnackController(); //클래스 SnackController과 Run클래스 연결해주는 것
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("스낵류를 입력하세요");
		System.out.print("종류 : ");
		String kind = sc.nextLine(); //<-클래스 SnackController를 쓸 땐 변수 통해 씀(저장)
//		s1.setKind(sc.nextLine()); <-snack 클래스에서 Getter Setter만 썼을 경우
//		                             클래스 SnackController를 쓸 땐 필요 없음 
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
//		s1.setName(sc.nextLine());
		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
//		s1.setFlavor(sc.nextLine());
		
		System.out.print("개수 : ");
		int numOf = Integer.parseInt(sc.nextLine());
//		s1.setNumOf(Integer.parseInt(sc.nextLine()));
		
		
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
//		s1.setPrice(Integer.parseInt(sc.nextLine()));
		
		Snack s1 = new Snack(kind,name,flavor,numOf,price);
		scr.saveData(s1);
		if(scr.saveData(s1)) {
			System.out.println("저장 완료되었습니다.");
			System.out.println(scr.confirmData());
		}
		
		
		
//		System.out.println(s1);
		System.out.println(s1.getKind()+"("+s1.getName()+" - " + s1.getFlavor()+") "+s1.getNumOf()+"개 "+s1.getPrice()+"원");
		
	}

}
