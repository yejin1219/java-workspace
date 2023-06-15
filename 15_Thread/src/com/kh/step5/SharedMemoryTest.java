package com.kh.step5;

public class SharedMemoryTest {

	public static void main(String[] args) {
	
		Calculator calcurator = new Calculator();

		User1 user1 = new User1();
		user1.setCalculator(calcurator);
		user1.start();
		
	    User2 user2 = new User2();
	    user2.setCalculator(calcurator);
	    user2.start();
	    
	    
	
	}

}
