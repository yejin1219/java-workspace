package com.kh.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.set.model.Person;

/*
 * Set의 특징
 * - 중복 없음
 * - 순서 없음
 * 
 * HashSet
 * - Set 인터페이스를 구현한 대표적인 컬렉션 클래스
 * 
 * 
 * */
public class A_HashSet {

	public static void main(String[] args) {

		A_HashSet a = new A_HashSet();
//		a.method1();
		a.method2();
	}

	
	public void method1() {
		Set<String> set = new HashSet<>();
		
		set.add("마동석");
		set.add("이준혁");
		set.add("아오키 무네타카");
		set.add("김민재");
		set.add("마동석");
		set.add("마동석");
		
		System.out.println(set); // [이준혁, 마동석, 김민재, 아오키 무네타카] 순서,중복 x
		System.out.println(set.size()); // 4
		System.out.println(set.contains("마동석")); // true
		
		set.remove("아오키 무네타카");
		System.out.println(set); // [이준혁, 마동석, 김민재]
		
		set.clear();
		System.out.println("비었는지? " + set.isEmpty()); // 비었는지? true
		System.out.println(set); // []
		
	}
	
	public void method2() {
		HashSet<Person> set = new HashSet<Person>();
		
		set.add(new Person("마동석",52));
		set.add(new Person("이준혁",39));
		set.add(new Person("아오키 무네타카",43));
		set.add(new Person("김민재",44));
		set.add(new Person("마동석",52));
		set.add(new Person("이준혁",39));
		
		
		System.out.println(set); // [Person [name=마동석, age=52], Person [name=이준혁, age=39], Person [name=마동석, age=52], 
		                         // Person [name=김민재, age=44], Person [name=아오키 무네타카, age=43], Person [name=이준혁, age=39]]

		/*
		 * - 객체의 주소값을 가지고 비교하기 때문에 모두 다른 객체로 인식해
		 *   중복 제거 되지 않음 
		 * --> Person 클래스에서 hashCode(), equals() 메서드 재정의 
		 * */
		
		System.out.println(set); //[Person [name=김민재, age=44], Person [name=아오키 무네타카, age=43], Person [name=마동석, age=52], Person [name=이준혁, age=39]]
		                         // hashCode(), equals() 메서드 재정의 후 중복 제거 되었음 
		
		System.out.println(set.size()); // 4
		
		/*
		 * Iterator
		 * - 컬렉션에 저장된 요소를 접근하는데 사용하는 인터페이스 
		 * - iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용 
		 * */
		Iterator <Person> it = set.iterator();
		
		while(it.hasNext()) { //읽어올 요소가 있는지 확인 
			System.out.println(it.next()); //Person.. 다음 요소를 읽어옴
		}               // ↓ 하나식 출력
//		        Person [name=김민재, age=44]
//				Person [name=아오키 무네타카, age=43]
//				Person [name=마동석, age=52]
//				Person [name=이준혁, age=39]
		
		
		
		
	}
}
