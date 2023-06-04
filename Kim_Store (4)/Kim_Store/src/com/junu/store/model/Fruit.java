package com.junu.store.model;

public class Fruit {
	
	private String name; // 과일의 이름을 입력하는 곳입니다!
	private int num; // 과일의 개수를 입력하는 곳입니다!
	
	/*
	 * 
	 * 1. Generate Constructors from Superclass
	 * 2. Generate Constructor using field
	 * 3. Generate Getter / Setter
	 * 4. Generate toString
	 * 
	 * 이 순서대로 해주시면 됩니다!
	 * 
	 */
	
	public Fruit() {
		super();
		
	}

	public Fruit(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", num=" + num + "]";
	}
	
	

}
