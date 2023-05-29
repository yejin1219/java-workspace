package com.kh.overriding;

import com.kh.overriding.model.Customer;
import com.kh.overriding.model.VIPCustomer;

public class Application {

	public static void main(String[] args) {

		Customer customer1 = new Customer("홍수민");
		Customer customer2 = new Customer("신수민");
		
		System.out.println(customer1);
		System.out.println(customer1);
		
		System.out.println(customer1.equals(customer2)); //false
		
		VIPCustomer customer3 = new VIPCustomer("최승환");
		VIPCustomer customer4 = new VIPCustomer("박승환");
		
		
		System.out.println(customer3.equals(customer4)); //false
		
		
		
		System.out.printf("%s님의 등급은 %s이며, " + "지불해야 할 금액은 %d이며, " + "적립된 포인트는 %d점입니다.\n", 
				customer2.getName(), customer2.getGrade(),customer2.calcPrice(1000),customer2.getBonusPoint());
		// 신수민님의 등급은 SILVER이며, 지불해야 할 금액은 1000이며, 적립된 포인트는 10점입니다.
		
		System.out.printf("%s님의 등급은 %s이며, " + "지불해야 할 금액은 %d이며, " + "적립된 포인트는 %d점입니다.\n",
				customer4.getName(), customer4.getGrade(),customer4.calcPrice(1000),customer4.getBonusPoint());
		// 박승환님의 등급은 VIP이며, 지불해야 할 금액은 900이며, 적립된 포인트는 50점입니다.
	}

}
