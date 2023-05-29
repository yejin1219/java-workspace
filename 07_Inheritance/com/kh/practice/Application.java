package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.controller.CircleController;
import com.kh.practice.controller.RectangleController;

public class Application {
	
	RectangleController rc  = new RectangleController();
	CircleController cc = new CircleController();
	Scanner sc  = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		Application app = new Application();
		app.mainMenu();
		
	}

	public void mainMenu() {
		
		boolean check = true;
		while(check) {
		
			System.out.println("=========메뉴========");
			
			System.out.println("1. 원 ");
			System.out.println("2. 사각형 ");
			System.out.println("9. 끝내기 ");
			System.out.print("메뉴 번호 :  ");
			int num = Integer.parseInt(sc.nextLine());
			
		switch(num) {
		case 1 : this.circleMenu();
			break;
		case 2 : this.rectangleMenu();
			break;
		case 9 : 
			System.out.println("종료합니다.");
			check = false;
			break ;
			
	   }
	}
	
}
	public void circleMenu() {
      System.out.println("========원 메뉴========");
		
		System.out.println("1. 원 둘레 ");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로 ");
		System.out.print("메뉴 번호 :  ");
	
		switch(Integer.parseInt(sc.nextLine())) {
		case 1 : this.calcCirum();
			break;
		case 2 : this.calcCircleArea();
			break;
		case 9 : 
			break;
			
	    }
   
}
	
	public void rectangleMenu() {
		
       System.out.println("========사각형 메뉴========");
		
		System.out.println("1. 사각형 둘레 ");
		System.out.println("2. 사각형 넓이");
		System.out.println("3. 메인으로 ");
		System.out.print("메뉴 번호 :  ");
	
		switch(Integer.parseInt(sc.nextLine())) {
		case 1 : this.calcPerimeter();
			break;
		case 2 : this.calcRectArea();
			break;
		case 9 : 
			break;
			
	    }
   
	}
	
   public void calcCirum() {
	   System.out.print("x 좌표 : ");
	   int x = Integer.parseInt(sc.nextLine());
	   System.out.print("y 좌표 : ");
	   int y = Integer.parseInt(sc.nextLine());
	   System.out.print("반지름 : ");
	   int radius = Integer.parseInt(sc.nextLine());
	   System.out.println(cc.calcCircum(x,y,radius));
	}
	
   public void calcCircleArea() {
		
	   System.out.print("x 좌표 : ");
	   int x = Integer.parseInt(sc.nextLine());
	   System.out.print("y 좌표 : ");
	   int y = Integer.parseInt(sc.nextLine());
	   System.out.print("반지름 : ");
	   int radius = Integer.parseInt(sc.nextLine());
	   System.out.println(cc.calcArea(x,y,radius));
		
	}
   
   public void calcPerimeter() {
		
		
	   System.out.print("x 좌표 : ");
	   int x = Integer.parseInt(sc.nextLine());
	   System.out.print("y 좌표 : ");
	   int y = Integer.parseInt(sc.nextLine());
	   System.out.print("높이 : ");
	   int height = Integer.parseInt(sc.nextLine());
	   
	   System.out.print("너비 : ");
	   int width = Integer.parseInt(sc.nextLine());
	   System.out.println(rc.calcPerimeter(x,y,height,width));
	}
   
   public void calcRectArea(){
	   
	   System.out.print("x 좌표 : ");
	   int x = Integer.parseInt(sc.nextLine());
	   System.out.print("y 좌표 : ");
	   int y = Integer.parseInt(sc.nextLine());
	   System.out.print("높이 : ");
	   int height = Integer.parseInt(sc.nextLine());
	   
	   System.out.print("너비 : ");
	   int width = Integer.parseInt(sc.nextLine());
	   System.out.println(rc.calcArea(x,y,height,width));
	   
   }
  
	
}
