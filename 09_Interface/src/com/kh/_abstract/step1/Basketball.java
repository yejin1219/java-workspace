package com.kh._abstract.step1;

public class Basketball extends Sports {

	public Basketball(int numberOfPlayers) {
		super(numberOfPlayers);
		
	}

	@Override
	public void rule() {
		
	   System.out.println("BasketBall의 선수의 수는" + this.numberOfPlayers + "명, 공을 던져서 링에 넣어야 한다.");
		
	}

	
	
	
	
}
