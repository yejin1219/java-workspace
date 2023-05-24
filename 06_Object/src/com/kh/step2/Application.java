package com.kh.step2;

import com.kh.step2.model.Card;

public class Application {

	public static void main(String[] args) {

		//클래스 변수는 인스턴스 생성 없이 호출 가능 
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		System.out.println();
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 3;
		
		System.out.println("첫 번째 카드는 "+ c1.kind + " " + c1.number + "이며, 크기는 " + c1.width + " X " + c1.height + "입니다." );
		System.out.println("첫 번째 카드는 "+ c2.kind + " " + c2.number + "이며, 크기는 " + c2.width + " X " + c2.height + "입니다." );
		//첫 번째 카드는 Heart 7이며, 크기는 100 X 250입니다.
		//첫 번째 카드는 Spade 3이며, 크기는 100 X 250입니다.
		
		
		
		
		// 클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로 항상 공통된 값을 갖는다.
		c1.height = 50;
		c1.width = 80;
		
		System.out.println("첫 번째 카드는 "+ c1.kind + " " + c1.number + "이며, 크기는 " + c1.width + " X " + c1.height + "입니다." );
		System.out.println("첫 번째 카드는 "+ c2.kind + " " + c2.number + "이며, 크기는 " + c2.width + " X " + c2.height + "입니다." );
		//첫 번째 카드는 Heart 7이며, 크기는 80 X 50입니다.
		//첫 번째 카드는 Spade 3이며, 크기는 80 X 50입니다.
	}

}
