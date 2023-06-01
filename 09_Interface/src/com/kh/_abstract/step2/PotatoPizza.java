package com.kh._abstract.step2;

public class PotatoPizza extends Pizza{

	
	public PotatoPizza(int price, String storeName) {
		super(price, storeName);
//		this.price = price;
//		this.storeName = storeName;
//		조상 클래스 Pizza 멤버 변수를 protected로 설정 되어 있어 자식 클래스에 접근 가능, this. 으로 초기화 가능 
	}

	@Override
	public void topping() {
	
		System.out.println("Potato Topping...");
	}

}
