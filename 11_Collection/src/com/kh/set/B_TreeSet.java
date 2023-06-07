package com.kh.set;

import java.util.Set;
import java.util.TreeSet;

import com.kh.set.model.Person;

/*
 * TreeSet
 * - 저장과 동시에 자동 오름차순 정렬
 * - HashSet보다 데이터 추가, 삭제에 시간이 더 걸림 
 * */
public class B_TreeSet {

	public static void main(String[] args) {

		B_TreeSet b = new B_TreeSet();
//		b.method1();
		b.method2();
		
	}
	
	public void method1() {
		Set<String> set = new TreeSet<>();
		
		set.add("마동성");
		set.add("이준혁");
		set.add("아오키 무네타카");
		set.add("김민재");
		set.add("마동석");
		set.add("마동석");
		
		System.out.println(set); // [김민재, 마동석, 마동성, 아오키 무네타카, 이준혁] 순서정렬
		
	}
	
	public void method2() {
		TreeSet<Person> set = new TreeSet<Person>();
		
		set.add(new Person("마동석",52));
		set.add(new Person("이준혁",39));
		set.add(new Person("아오키 무네타카",43));
		set.add(new Person("김민재",44));
		set.add(new Person("마동석",52));
		set.add(new Person("이준혁",39));
		
		System.out.println(set); // 1.오름차순 정력 [Person [name=이준혁, age=39], Person [name=아오키 무네타카, age=43], 
		                         //  Person [name=김민재, age=44], Person [name=마동석, age=52]] 
		System.out.println(set); // 2. 내림차순 정렬 [Person [name=마동석, age=52], Person [name=김민재, age=44], 
		                         // Person [name=아오키 무네타카, age=43], Person [name=이준혁, age=39]]
		System.out.println(set);  // 3. 이름 오름차순 [Person [name=김민재, age=44], Person [name=마동석, age=52], Person [name=아오키 무네타카, age=43], Person [name=이준혁, age=39]]
	}

}
