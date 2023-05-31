package com.kh.practice.controller;

import com.kh.practice.model.AniBook;
import com.kh.practice.model.Book;
import com.kh.practice.model.CookBook;
import com.kh.practice.model.Member;

public class LibraryController {

	private Member member = null;
	private Book[] bookList = new Book[4];
	{
		bookList[0] = new CookBook("김대석 셰프의 집팝 레시피", true);
		bookList[1] = new CookBook("에브리데이 베이글", false);
		bookList[2] = new AniBook("원피스 105", 19);
		bookList[3] = new AniBook("최애의 아이 10", 15);
	}
	
//	멤버 생성자 이용해서 멤버 정보  추가 
	public void insertMember(String name, int age) {
		
		member = new Member(name,age);

		
	}
	
	public Member myInfo() {
		return member;

	}
	
	// 매개 변수로 받은 키워드가 포함된 제목을 가진 책 1권을 반환
	public Book searchBook(String keyword) {
		// 문자열.contains() <-- 이거 이용!
		for(Book book: bookList) {
			if(book.getTitle().contains(keyword)) {
				return book;
			}
		}return null;
	}

	
	public Book[] viewBooks() {
     	return bookList;
	}
	
	
	/*
	 * 대여할 책의 인덱스를 매개변수로 받아서 조건에 따라 처리 
	 * - 만화책(AniBook) 인 경우 나이 제한
	 * - 요리책(CookBook)인 경우 쿠폰이 있을 때
	 */
	public boolean rentBook(int index) {
		//if else, instanceof
		// 만화책인 경우 : getAccessAge(), getAge()
		
		// 요리책인 경우 : isCoupon(), setCoupon(), getCookCoupon()
		
		Book selectBook = bookList[index];
		if(selectBook instanceof AniBook) {
			AniBook aniBook = (AniBook) selectBook;
			if(aniBook.getAccessAge() >member.getAge()) {
				return false;
			}
			
			
			}else if(selectBook instanceof CookBook){
				CookBook cookBook = (CookBook) selectBook;
				if(cookBook.isCoupon()) {
					member.setCookCoupon(member.getCookCoupon() + 1);
				}
		}
		member.setBook(selectBook);
		return true;
	}
}

