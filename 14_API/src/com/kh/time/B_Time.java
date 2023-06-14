package com.kh.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class B_Time {

	/*
	 * java.time 패키지
	 * - Date와 Calendar의 단점을 개선한 새로운 클래스들을 제공(JDK1.8)
	 * - LocalDate, LocalTime,LocalDateTime,ZonedDateTime 클래스 포함
	 * - 날짜와 시간에 대한 다양한 메서드를 제공
	 * */
	
	public static void main(String[] args) {
	
		B_Time b = new B_Time();
		
//		b.method1();
//		b.method2();
//		b.method3();
		b.method4();
	}

	
	public void method1() {
		/*
		 * LocalDateTime
		 * - 날짜와 시간 정보를 모두 저장
		 * */
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now : " + now); //now : 2023-06-14T09:47:58.485366300
		
		// 날짜 지정
		LocalDateTime when = LocalDateTime.of(2023, 11, 1, 17, 50, 0);
		System.out.println("when : " + when); //when : 2023-11-01T17:50
		
		//ZonedDateTime : LocalDateTime(날짜, 시간) + 시간대
		System.out.println("ZonedDateTime : " + ZonedDateTime.now()); //ZonedDateTime : 2023-06-14T09:47:58.486366400+09:00[Asia/Seoul]
		
		//년, 월, 일, 요일, 시, 분, 초
		System.out.println("년도 : " + now.getYear()); //년도 : 2023
		System.out.println("월 : " + now.getMonth()); //월 : JUNE
		System.out.println("월 : " + now.getMonthValue()); //월 : 6
		System.out.println("일 : " + now.getDayOfMonth()); //일 : 14
		System.out.println("일 : " + now.getDayOfYear()); //일 : 165
		System.out.println("요일 : " + now.getDayOfWeek());//요일 : WEDNESDAY
		System.out.println("시 : " + now.getHour()); //시 : 10
		System.out.println("분 : " + now.getMinute());//분 : 6
		System.out.println("초 : " + now.getSecond()); //초 : 13
		
		System.out.println();
		
		//날짜 조작
		LocalDateTime plusDays = now.plusDays(1).plusMonths(2).plusYears(1);
		System.out.println("plusDays : " + plusDays); //plusDays : 2024-08-15T10:08:44.326637
		System.out.println("isAfter : " + now.isAfter(plusDays)); //오늘이 해당 날짜보다 이후인가? isAfter : false
		System.out.println("isBefore : " + now.isBefore(plusDays)); // 오늘이 해당 날짜보다 이전인가? isBefore : true
		
		LocalDateTime minusDays = now.minusMonths(2).minusDays(10).minusYears(3);
		System.out.println("minusDays : " + minusDays); // minusDays : 2020-04-04T10:14:44.292543900
		
		LocalDateTime withDays = now.withYear(2025).withMonth(3).withDayOfMonth(1);
		System.out.println("withDays : " + withDays); //withDays : 2025-03-01T10:14:44.292543900
		
		
		System.out.println();
		
		
		/*
		 * LocalDate
		 * - 날짜 정보만 저장
		 * */
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate : " + localDate); //localDate : 2023-06-14
		
		localDate = LocalDate.of(2023, 11, 1); //LocalDate.of : 지정된 날짜로 바꾸기
		System.out.println("localDate2 : " + localDate); //localDate2 : 2023-11-01
		
		localDate = now.toLocalDate(); // 다시 원래 날짜 대로 되돌리기 
		System.out.println("localDate3 : " + localDate); //localDate3 : 2023-06-14

		System.out.println();
		
		/*
		 * LocalTime
		 * - 시간 정보만 저장 
		 * */
		LocalTime localTime = LocalTime.now(); // 현재 시간 들어감 
		System.out.println("localTime : " + localTime); //localTime : 10:23:48.593128400
		
		localTime = LocalTime.of(9, 27,34); //지정 시간으로 바꿔
		System.out.println("localTime2: " + localTime); //localTime2: 09:27:34
		
		localTime = now.toLocalTime();// 다시 원래 시간 대로 되돌리기 
		System.out.println("localTime3 : " + localTime); //localTime3 : 10:23:48.591128
		
		
	}
	
	
	
	
	/*
	 * Period 와 Duration
	 * - 날짜와 시간 간격을 표현하기 위한 클래스 
	 * - period : 두 날짜 간의 차이
	 * - Duration : 시간의 차이 
	 * 
	 * 
	 * */
	public void method2() {
		
		/*
		 * between() : 두 날짜의 차이
		 * */
		LocalDate date1 = LocalDate.of(2023, 1, 1);
		LocalDate date2 = LocalDate.of(2024, 12, 31);
		
		Period pe = Period.between(date1, date2);
		System.out.println("period : " + pe); // period : P1Y11M30D(1년11개월30일 차이가 난다)
		
		System.out.println("years : " + pe.getYears()); //years : 1
		System.out.println("years : " + pe.get(ChronoUnit.YEARS));//years : 1
		
		System.out.println("months : " + pe.getMonths()); //months : 11
		System.out.println("months : " + pe.get(ChronoUnit.MONTHS)); //months : 11
		
		System.out.println("days : " + pe.getDays()); //days : 30
		System.out.println("days : " + pe.get(ChronoUnit.DAYS)); //days : 30
		
		
		pe = pe.plusYears(3).multipliedBy(2); //3년을 더하고, 2배를 곱한다. 
	    System.out.println("연산 후 : " + pe); //연산 후 : P8Y22M60D
	    
		
	    System.out.println();
	    
	    LocalTime time1 = LocalTime.of(00, 00, 00);
	    LocalTime time2 = LocalTime.of(10, 36, 56);
	    
	    Duration du = Duration.between(time1, time2);
	    System.out.println(du); //PT10H36M56S
	    
	    du = du.plusHours(1).dividedBy(60);
	    
	    
	    
	    
	    LocalTime time = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
	    System.out.println("HOURS: " + time.getHour());
	    System.out.println("MINUTE: " + time.getMinute());
	    System.out.println("SECOND: " + time.getSecond());
	    
	    
	    
	}
	
	
	
	public void method3() {
		// 문자열을 LocalDate 객체로 파싱
		LocalDate date = LocalDate.parse("2023-05-11");
		System.out.println(date); //2023-05-11
		
//		date = LocalDate.parse("2023.05.11"); //에러뜸
		// ↓
		date = LocalDate.parse("2023.05.11", DateTimeFormatter.ofPattern("yyyy.MM.dd")); 
		System.out.println(date); //2023-05-11
		
		date = LocalDate.parse("20230511", DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(date); //2023-05-11
	
		System.out.println();
		
		/*
		 * DateTimeFormatter
		 * - 날짜와 시간을 포맷팅(Formatting)된 문자열로 변환하는 메서드를 제공하는 클래스
		 * 
		 * 
		 * */
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(today.format(ofPattern)); //2023년 06월 14일 11시 04분 28초
		
		//DateTimeFormatter에 표준화된 포맷들이 상수로 미리 정의 
		System.out.println(today.format(DateTimeFormatter.ISO_WEEK_DATE)); //2023-W24-3
		System.out.println(today.format(DateTimeFormatter.ISO_ORDINAL_DATE)); //2023-165
		
		//ZonedDateTime Format~
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME)); //Wed, 14 Jun 2023 11:08:26 +0900
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ISO_ZONED_DATE_TIME)); //2023-06-14T11:08:26.4464265+09:00[Asia/Seoul]

		
	}
	
	
	// D-DAY  계산기 : 년월일을 입력하여 디데이 계산
	public void method4() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년 : ");
		int year = Integer.parseInt(sc.nextLine());
		

		System.out.print("월 : ");
		int month = Integer.parseInt(sc.nextLine());
		
		System.out.print("일 : ");
		int day = Integer.parseInt(sc.nextLine());
		
		LocalDate  nowDate = LocalDate.now();
		LocalDate inputDate = LocalDate.of(year, month, day);
		
		long dDay = ChronoUnit.DAYS.between(nowDate, inputDate);
		dDay = nowDate.until(inputDate, ChronoUnit.DAYS);
		
		if(dDay ==0) {
			System.out.println("오늘!");
		}else if(dDay > 0) {
		
		   System.out.println("D-" + dDay);
		}else {
			System.out.println("태어난 날부터 지금까지 " + -(dDay) + "일 지났습니다.");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
