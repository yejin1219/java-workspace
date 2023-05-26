package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;

public class Application {

	public static void main(String[] args) {

		// -------------------화면---------------------1.
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : ");
		String kind = sc.nextLine();
		
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		
		System.out.print("갯수 : ");
		int numOf = Integer.parseInt(sc.nextLine());
		
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());	
		// -------------------------------------------3.
		// 데이터를 서버한테 요청하는 곳!(화면부분은 아님 console을 화면이라고 치면 화면에 나타나는 부분은 아님 )
		SnackController snackControl = new SnackController();  //ctrl 누르고 snackControl에 마우스 올리면 snackControl메서드로 이동 
		Snack viewSnack = new Snack(kind,name,flavor,numOf,price); //kind,name,flavor,numOf,price 순서 지키면서 쓰기 
		snackControl.saveData(viewSnack); //viewSnack값을 snackControl.saveData로 보내서 true 로 응답 받음 
		
		// -------------------------------------------2.
		//서버한테 응답받아 데이터 결과를 받아서 다시 화면으로 돌아온 곳!
		System.out.println("저장 되었습니다.");
		System.out.println(snackControl.confirmData());
		
		
		
		
		
	}

}
