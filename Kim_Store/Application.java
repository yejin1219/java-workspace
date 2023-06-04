package com.junu.store;

import java.util.Scanner;

import com.junu.store.controller.FruitController;
import com.junu.store.model.Fruit;

/*
 * 김씨 가게에 오신걸 환영합니다
 * 김씨는 과일을 팔려고 하는데요
 * 아직 물건을 들여놓지 않아 어떤 과일을 가져올지 고민중입니다!
 * 과일 3가지를 등록하고 어떤과일이 있는지 보여주세요!
 * 
 * 1. 모델 Fruit로 가서 적혀있는걸 해주세요!
 * 2. controller로 가서 적혀있는걸 해주세요!
 */

public class Application {
	FruitController fc = new FruitController();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Application a = new Application();
		a.main();
		
		

	}
	
	public void main() {
		boolean power = true;
		/* 
		 * 
		 * while 문을 이용해 power가 켜져있을때 키보드 입력을 받아 해당 메뉴에 들어갈 수 있게 해주세요!!
		 * 1번 기능 Fruit 추가하기 (addFruit)
		 * 2번 기능 Fruit 리스트 보기! (showFruit)
		 * 9번 기능 power 끄기
		 */
		while(power) {
			int menunum;
			System.out.println("메뉴를 입력해주세요!");
			System.out.println("1. Fruit 추가하기");
			System.out.println("2. Fruit 리스트 보기");
			System.out.println("9. 나가기");
			
		}
		
	}
	
	public void addFruit() { // 과일의 이름을 받고 저장, 개수를 받고 저장 이런식으로 하시면 됩니다!
		
		String name;
		int num;
		
		
		fc.addFruit(name, num);
		
		
	}
	
	public void showFruit() { // 과일을 보여주는 칸입니다!
		fc.showFruit();   // 이거는 배열로 받아오는거니까 어떤 처리를 해야겠죠?
	}

}
