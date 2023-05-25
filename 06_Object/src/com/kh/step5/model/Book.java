package com.kh.step5.model;

public class Book {
	
	/*
	 * 캡슐화(Encapsulation)
	 *  - 정보은닉 : 외부에서 객체 접근하는데 있어서 정보를 숨기고 객체의 연산을 통해서만 접근이 가능하게 하는 것
	 *  - 외부에서 특정 객체의 데이터 및 함수를 직접 접근을 막음으로써 변경을 못하게 유지보수나 확장시 오류의 
	 *    범위를 최소화 할 수 있고, 객체 내 정보손상, 오용을 방지하고, 조작법이 바뀌어도 사용방법 자체는 바뀌지 않고, 데이터가 변경되어도
	 *    다른 객체에 영향을 주지 않기 때문에 독립성이 좋고, 처리된 결과 사용으로 이식성이 좋고,
	 *    객체를 모듈화할 수 있어 새로운 시스템의 구성에 하나의 모듈처럼 사용이 가능 
	 * 
	 */

	/*
	 * 싱글톤   생성자까지 private 했을 때 여기저기서 쓸 있도록 하는 것  (지금 몰라도 됨 나중에 알게 됨)
	 * private static Book singLeton = new Book();
	 * private Book(){}
	 * public static Book getInstance(){
	 *   if(singLeton == null) singLeton = new Book();
	 *   return singLeton;
	 * }
	 * 
	 */
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public Book() {}
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	
	
	// setter /getter
	public String getTitle() {
		return title;
		
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return price;
		
	}
	public void setPrice(int price) {
		this.price = price;
		
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	
	public String getAuthor() {
		return author;
	
	}
	
	public void setAuthor (String author) {
		this.author = author;
	
	}
	
	
	public String toString() {
		return "title : " + title + ", price" + price + 
				", discountRate" +discountRate + ", autor" + author;}
}
