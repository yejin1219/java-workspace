package com.kh.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.practice1.model.Snack;

/*
 * Map
 * - key-value 를 쌍으로 저장
 * - 순서 없음
 * - 중복 : 값(value) o, 키(key)x
 * 
 * HashMap
 * - Map 인터페이스를 구현한 대표적인 컬렉션 클래스
 * 
 * */
public class A_HashMap {

	public static void main(String[] args) {

		A_HashMap a = new A_HashMap();
//		a.method1();
		a.method2();
	}

	
	public void method1() {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("빈 디젤", 90);
		map.put("제이슨 모모아", 100);
		map.put("제이슨 스타뎀", 90);
		map.put("미셸 로드리게즈", 85);
		
		System.out.println(map); // {제이슨 모모아=100, 제이슨 스타뎀=90, 빈 디젤=90, 미셸 로드리게즈=85}
		
		// 1. 키(key)만 가져오기 : keySet()
		Set<String> key = map.keySet();
		System.out.println(key); // [제이슨 모모아, 제이슨 스타뎀, 빈 디젤, 미셸 로드리게즈]
		
		// 2. 값(value)만 가져오기 : values()
		Collection<Integer> col = map.values();
		System.out.println(col); // [100, 90, 90, 85]
		
		// 3. 키에 해당하는 value 값 가져오기(가장 많이 씀)
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name + " : " + map.get(name));
		}
//		제이슨 모모아 : 100
//		제이슨 스타뎀 : 90
//		빈 디젤 : 90
//		미셸 로드리게즈 : 85
		
		
		System.out.println();
		
		
		
		
		
		/*
		 * 4. entrySet() 메서드 
		 * - entrySet() 메서드는 Map컬렉션에 있는 Entry 객체(key, value 쌍으로 이루어진)를 Set 컬렉션에 담아서 반환
		 * 
		 * */
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
//		제이슨 모모아 : 100
//		제이슨 스타뎀 : 90
//		빈 디젤 : 90
//		미셸 로드리게즈 : 85
		
		
		
		System.out.println();
		
//		<문제>
		/*
		 * 총점 : 365
		 * 평균  : 91
		 * 최고점수 : 100
		 * 최저점수 : 85
		 * 
		 * */

		
//	<내 풀이>
		int sum = 0;
		for(Entry<String, Integer> entry : entrySet) {
			
			sum += entry.getValue();
			
		}System.out.println ( "총점 : " + sum);
		
//	<강사님 풀이>	
//		int total = 0;
//		Iterator<Integer> value = col.iterator();
//		while(value.hasNext()) {
//			total += value.next();
//		}
//		System.out.println ( "총점 : " + total);
		
		
		System.out.println ( "평균 : " + sum / map.size());
		System.out.println ( "최고점수 : " + Collections.max(col));
		System.out.println ( "최저점수 : " + Collections.min(col));
		
	
	}
	
	
	
	public void method2() {
		
		
		Map<String, Snack> map = new HashMap<>();
		
		map.put("웨하스", new Snack("치즈",240));
		map.put("웨하스", new Snack("딸기",255));
		map.put("고래밥", new Snack("양념치킨",173));
		map.put("자유시간", new Snack("아몬드",232));
		map.put("칸쵸", new Snack("딸기 요거트",880));
		map.put("홈런볼", new Snack("초코",270));
		map.put("스윙칩", new Snack("볶음고추",347));
		map.put("나쵸", new Snack("치즈",486));
		map.put("꼬깔콘", new Snack("매콤달콤",175));
		map.put("후렌치파이", new Snack("딸기",900));
		
		System.out.println(map);
		System.out.println(map.size()); //9
		
		//key에 해당하는  value 값 가져오기
		Snack snack = map.get("웨하스");
		System.out.println(snack);
		
		//key 값에 해당하는 Entry 객체 삭제
		map.remove("꼬깔콘");
		System.out.println(map);
		System.out.println(map.size()); //8
		
		System.out.println("=========================================================");
		
		// 1. 홈런볼에 해당하는 과자 정보 출력 : Snack [flavor= 초코, calorie=270]
		
		Snack snack1 = map.get("홈런볼");
		System.out.println(snack1);
		
		
		//2. 후렌치파이의 맛 정보 출력 : 딸기 
		
		Snack snack2 = map.get("후렌치파이");
		System.out.println("후렌치파이의 맛 정보 출력 : " +snack2.getFlavor());
		
		
		//3. 맛에 '딸기'가 들어간 과자들의 칼로리 평균 
		
		
		Collection<Snack> co = map.values();
		int total = 0;
		int count = 0;
		Iterator<Snack> value = co.iterator();
		while(value.hasNext()) {
			
			Snack s = value.next();
			
			if(s.getFlavor().contains("딸기")) {
				count++;
				total += s.getCalorie();
			}
			
//			if(((Snack) value).getFlavor().contains("딸기")) {  
//				count++;
//				total += ((Snack) value).getCalorie();
//			}
			
		}
		System.out.println("칼로리 평균 : " + total/count);
		
//		<강사님 풀이>
//		Set<String> keys = map.keySet();
//		for(String key : keys) {
//			if(map.get(key).getFlavor().contains("딸기")) {
//				total += map.get(key).getCalorie();
//				count++;
//			}
//		}
//		System.out.println("칼로리 평균 : " + total/count);
//		
		
		
		
		
		System.out.println("=========================================================");
		
		
		
		
		
		
		
		
	}
}
