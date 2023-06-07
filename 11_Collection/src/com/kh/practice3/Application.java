package com.kh.practice3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice3.controller.FarmController;
import com.kh.practice3.model.Farm;
import com.kh.practice3.model.Fruit;
import com.kh.practice3.model.Nut;
import com.kh.practice3.model.Vegetable;

public class Application {
	
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	
	

	public static void main(String[] args) {

		System.out.println("========== KH 마트 ==========");
		Application app = new Application();
		app.mainMenu();
		
		
		
		
	}
	
	public void mainMenu() {
		boolean check = true;
		
		while(check) {
			try {
			System.out.println("****** 메뉴 ******");
			System.out.println("1. 직원 메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			switch(Integer.parseInt(sc.nextLine())) {
			case 1:
				adminMenu();
				break;
			case 2:
				customerMenu();
				break;
			case 9:
				check = false;
				System.out.println("프로그램 종료");
				break;
			}
		}catch(Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요 " );
		     mainMenu();
				
			}
		}
	
	
	
     
	}
	
	
	public void adminMenu() {

		System.out.println("****** 직원 메뉴 ******");
		System.out.println("1. 새 농산물 추가");
		System.out.println("2. 농산물 삭제");
		System.out.println("3. 수량 수정");
		System.out.println("4. 농산물 목록");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 선택 : ");
		switch(Integer.parseInt(sc.nextLine())) {
		case 1:
			addNewKind();
			break;
		case 2:
			removeKind();
			break;
		case 3:
			changeAmount();
			break;
		case 4:
			printFarm();
			break;
		case 9:
			break;
		}
		
	}
	
	public void customerMenu() throws Exception {
		
		System.out.println("현재 KH마트 농산물 수량");
		printFarm();
		System.out.println("****** 고객 메뉴 ******");
		System.out.println("1. 농산물 사기");
		System.out.println("2. 농산물 빼기");
		System.out.println("3. 구입한 농산물 보기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 선택 : ");
		switch(Integer.parseInt(sc.nextLine())) {
		case 1:
			buyFarm();
			break;
		case 2:
			removeFarm();
			break;
		case 3:
			printBuyFarm();
			break;
		case 9:
			break;
		}
		
	}
	
	public void addNewKind() {
		
		/*
		 * 1. 과일 / 2. 채소 / 3. 견과 를 통해 번호로 종류를 받고 추가할 농산물의 이름과 수량도 받음.
		 * 없는 번호를 선택하면 "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되며 다시 번호를 받고,
		 * 선택한 종류에 따라 객체가 다름.
		 * 
		 * 데이터를 저장한 객체와 수량을 fc의 addNewKind()로 넘기고
		 * 전달받은 반환 값이 true면 "새 농산물이 추가되었습니다.",
		 * false면 "새 농산물 추가에 실패하였습니다. 다시 입력해주세요." 출력되며 다시 번호를 받음.
		 * 
		 * */
	
		
		try {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			int select = Integer.parseInt(sc.nextLine());
			System.out.print("추가할 이름 : ");
			String name = sc.nextLine();
			System.out.print("추가할 수량 : ");
			int amount = Integer.parseInt(sc.nextLine());
			
			Fruit fruit = new Fruit("과일",name);
			Vegetable vg = new Vegetable("채소",name);
			Nut nut = new Nut("견과",name);
			
			switch(select) {
			case 1 :
				if(fc.addNewKind( fruit, amount)) {
					System.out.println("새 농산물이 추가되었습니다.");
				}else {
				   System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");}
				break;
			case 2 :
				if(fc.addNewKind(vg, amount)) {
				System.out.println("새 농산물이 추가되었습니다.");
			}else {
			   System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");}
				break;
			case 3 :
				if(fc.addNewKind( nut, amount)) {
					System.out.println("새 농산물이 추가되었습니다.");
				}else {
				   System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");}
				break;
			} 
			
			this.adminMenu();
			
			
		}catch(Exception e){
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			this.addNewKind();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void removeKind() {
		
		/*
		 * 1. 과일 / 2. 채소 / 3. 견과 를 통해 번호로 종류를 받고 삭제할 농산물의 이름도 받음.
		 * 없는 번호를 선택하면 "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되며 다시 번호를 받고,
		 * 선택한 종류에 따라 객체가 다름.
		 * 
		 * 데이터를 저장한 객체와 수량을 fc의 removeKind()로 넘기고
		 * 전달받은 반환 값이 true면 "농산물 삭제에 성공하였습니다.",
		 * false면 "농산물 삭제에 실패하였습니다. 다시 입력해주세요." 출력되며 다시 번호를 받음.
		 * 
		 * */
		try {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			int select = Integer.parseInt(sc.nextLine());
			System.out.print("추가할 이름 : ");
			String name = sc.nextLine();
			System.out.print("추가할 수량 : ");
			int amount = Integer.parseInt(sc.nextLine());
			
			Fruit fruit = new Fruit("과일",name);
			Vegetable vg = new Vegetable("채소",name);
			Nut nut = new Nut("견과",name);
			
			switch(select) {
			case 1 :
				if(fc.removeKind( fruit)) {
					System.out.println("농산물 삭제에 성공하였습니다.");
				}else {
				   System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");}
				break;
			case 2 :
				if(fc.removeKind(vg)) {
				System.out.println("농산물 삭제에 성공하였습니다.");
			}else {
			   System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");}
				break;
			case 3 :
				if(fc.removeKind( nut)) {
					System.out.println("농산물 삭제에 성공하였습니다.");
				}else {
				   System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");}
				break;
			} 
			
			this.adminMenu();
			
			
		}catch(Exception e){
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			this.removeKind();
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	public void changeAmount() {
				
		/*
		 * 1. 과일 / 2. 채소 / 3. 견과 를 통해 번호로 종류를 받고 수정할 농산물의 이름과 수량도 받음.
		 * 없는 번호를 선택하면 "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되며 다시 번호를 받고,
		 * 선택한 종류에 따라 객체가 다름.
		 * 
		 * 데이터를 저장한 객체와 수량을 fc의 changeAmount()로 넘기고
		 * 전달받은 반환 값이 true면 "농산물 수량이 수정되었습니다.",
		 * false면 "농산물 수량 수정에 실패하였습니다. 다시 입력해주세요." 출력되며 다시 번호를 받음.
		 * 
		 * */
		
		try {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("수정할 종류 번호 : ");
			int select = Integer.parseInt(sc.nextLine());
			System.out.print("수정할 이름 : ");
			String name = sc.nextLine();
			System.out.print("수정할 수량 : ");
			int amount = Integer.parseInt(sc.nextLine());
			
			Fruit fruit = new Fruit("과일",name);
			Vegetable vg = new Vegetable("채소",name);
			Nut nut = new Nut("견과",name);
			
			switch(select) {
			case 1 :
				if(fc.changeAmount( fruit,amount)) {
					System.out.println("농산물 수량이 수정되었습니다.");
				}else {
				   System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");}
				break;
			case 2 :
				if(fc.changeAmount( vg,amount)) {
				System.out.println("농산물 수량이 수정되었습니다.");
			}else {
			   System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");}
				break;
			case 3 :
				if(fc.changeAmount( nut,amount)) {
					System.out.println("농산물 수량이 수정되었습니다.");
				}else {
				   System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");}
				break;
			} 
			
			this.adminMenu();
			
			
		}catch(Exception e){
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			this.changeAmount();
		}
		

	}
	
	public void printFarm() {
		
		// fc의 printFarm()의 반환 값을 이용하여 keySet()을 통해 "종류 : 이름(n개)" 형식으로 출력
		 farm = fc.printFarm().keySet();
		
		
		
	
	public void buyFarm() {
		
		
		/*
		 * 1. 과일 / 2. 채소 / 3. 견과 를 통해 번호로 종류를 받고 구매할 농산물의 이름도 받음.
		 * 없는 번호를 선택하면 "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되며 다시 번호를 받고,
		 * 선택한 종류에 따라 객체가 다름.
		 * 
		 * 데이터를 저장한 객체를 fc의 buyFarm()으로 넘기고
		 * 전달받은 반환 값이 true면 "구매에 성공하였습니다.",
		 * false면 "마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요." 출력되며 다시 번호를 받음.
		 * 
		 * */
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("구매 종류 번호 : ");
		int select = Integer.parseInt(sc.nextLine());
		System.out.print("구매할 것 : ");
		String name = sc.nextLine();
		
	}
	
	public void removeFarm() {
		
		/*
		 * 1. 과일 / 2. 채소 / 3. 견과 를 통해 번호로 종류를 받고 구매취소할 농산물 이름도 받음.
		 * 없는 번호를 선택하면 "잘못 입력하셨습니다. 다시 입력해주세요."가 출력되며 다시 번호를 받고,
		 * 선택한 종류에 따라 객체가 다름.
		 * 
		 * 데이터를 저장한 객체를 fc의 removeFarm()으로 넘기고
		 * 전달받은 반환 값이 true면 "구매 취소에 성공하였습니다."
		 * false면 "구매 목록에 존재하지 않습니다. 다시 입력해주세요." 출력되며 다시 번호를 받음.
		 * */
	
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("취소 종류 번호 : ");
		int select = Integer.parseInt(sc.nextLine());
		System.out.print("구매 취소할 것 : ");
		String name = sc.nextLine();
		
	}
	
	public void printBuyFarm() {
		
		// fc의 printBuyFarm()의 반환 값을 이용하여 출력
		
	}

}
