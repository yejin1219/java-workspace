package com.kh.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class A_Date {

	public static void main(String[] args) {
		

		A_Date a = new A_Date();
//		a.method1();
//		a.method2();
//		a.method3();
		a.practice();
//		a.practice1();
	}
	
	
	/*
	 * Date
	 * - java.util 패키지에 속한 날짜와 시간을 다룰 목적으로 만들어진 클래스(JDK 1.0)
	 * - Date의 메서드는 대부분 deprecated(비권장) 되어있지만 여전히 사용
	 * 
	 * 
	 * 
	 * */
	
	
	public void method1() {
		
		// 기본 생성자로 객체를 생성하면 현재 시스템의 시간에 대한 정보를 객체를 생성
		
		Date today = new Date();
		System.out.println(today); //Tue Jun 13 14:07:00 KST 2023
		
		//1970년 1월 1일 00시 -> 한국 표준 시간(KST)으로 출력될 땐
		//그리니치 평균시(GMT) 보다 +9 증가된 시간으로 표시
		Date when = new Date(0);
		System.out.println(when);
		
		
		// Deprecated된 기능들(취소선)
		System.out.println("getYear : " + (today.getYear()+ 1900) + "년"); //getYear : 2023년
		System.out.println("getMonth : " + (today.getMonth()+ 1) + "월"); //getMonth : 6월
		System.out.println("getDate : " + today.getDate() + "일"); //getDate : 13일
		System.out.println("getHours : " + today.getHours() + "시"); //getHours : 14시
		System.out.println("getMinutes : " + today.getMinutes() + "분"); //getMinutes : 14분
		System.out.println("getSeconds : " + today.getSeconds() + "초"); //getSeconds : 11초
		
		System.out.println();
		
		/*
		 * SimpleDateFormat 클래스 : 날짜 데이터를 원하는 형태로 출력할 수 있도록 
		 * - y : 년도
		 * - M : 월
		 * - D : 년의 몇 번째 일
		 * - d : 월의 몊 번째 일
		 * - E : 요일
		 * - a : 오전/오후
		 * - H : 시간(0~23)
		 * - h : 시간(1~12)
		 * - m : 분
		 * - s : 초
		 * 
		 * */
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		String formatDate = sdf.format(today);
		System.out.println(formatDate);
		
		
		//2023년 6월 13일 (화) 오후 2시 21분 10초
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 (E) a hh시 mm분 ss초");
		 formatDate = sdf1.format(today);
		 System.out.println(formatDate);
		
		
	}
	
	
	
	/*
	 * Calendar
	 * - Date 클래스를 개선한 추상 클래스(JDK1.1)
	 * - 여전히 단점이 존재 
	 * 
	 * */
		 public void method2() {
			 
//			 Calendar cal = new Calendar(); 추상클래스는 객체 생성x
			 Calendar today = Calendar.getInstance();
			 System.out.println(today);
			 today = new GregorianCalendar(); //// 태국은 BuddhistCalendar
			 System.out.println(today);
			 
			 System.out.println();
			 
			 System.out.println("YEAR : "+ today.get(Calendar.YEAR)+ "년");// YEAR : 2023년
			 System.out.println("MONTH : "+ (today.get(Calendar.MONTH)+1)+ "월"); //0이 1월이라 +1해줘야 함, MONTH : 6월
			 System.out.println("DATE : "+ today.get(Calendar.DATE)+ "일");// DATE : 13일
			 System.out.println("HOUR : "+ today.get(Calendar.HOUR)+ "시");// HOUR : 2시  //(0~11)
			 System.out.println("TODAY_OF_DAY : " + today.get(Calendar.HOUR_OF_DAY) + "시"); //TODAY_OF_DAY : 14시 // (0~23)
			 System.out.println("MINUTE : "+ today.get(Calendar.MINUTE)+ "분"); //MINUTE : 43분
			 System.out.println("SECONDE : "+ today.get(Calendar.SECOND)+ "초"); //SECONDE : 59초
			 
			 
			 System.out.println();
			 
			 
			 //날짜 지정
			 Calendar date = Calendar.getInstance();
			 date.set(2023, 5, 15);
			 System.out.println(date);
			 System.out.println(date.getTime().toString()); //Thu Jun 15 14:47:27 KST 2023
			 
			 date.set(2023, Calendar.MAY, 15,9,0,0);
			 System.out.println(date);
			 System.out.println(date.getTime().toString()); //Mon May 15 09:00:00 KST 2023
			 
			  System.out.println();
			 
			long timeInMillis =  date.getTimeInMillis();
			System.out.println("1000분의 1초 : " + timeInMillis ); //1000분의 1초 : 1684108800652
			
			long second = timeInMillis/1000;
			System.out.println("초 : " +  second); //초 : 1684108800
			 
			long minute = second/60;
			System.out.println("분 : " + minute); //분 : 28068480
			
			long hour = minute/60;
			System.out.println("시간 : " + hour); //시간 : 467808
			
			long day = hour/24;
			System.out.println("일 : " + day); //일 : 19492
			
			long year = day/365;
			System.out.println("년 : " + year); //년 : 53
			
			System.out.println();
			
			
			//SimpleDateFormat 클래스 사용!
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String formateDate = sdf.format(date.getTime());
			System.out.println(formateDate);
			
			
		 }
		 
		 
		 
		 //Date 와 Calendar 간의 변화
		 public void method3() {
			 
			 //1. Calendar -> Date로 변환 시 : getTimeInMillis()사용 
			 Calendar cal = Calendar.getInstance();
			 Date d = new Date(cal.getTimeInMillis());
			 System.out.println(d); //Tue Jun 13 15:19:35 KST 2023
			 
			 
			 //2. Date -> Calendar
			 Date d2 = new Date();
			 Calendar cal2 = Calendar.getInstance();
			 cal2.setTime(d2);
			 System.out.println(cal2.getTime().toString()); //Tue Jun 13 15:19:35 KST 2023
			 
		 }
		
		 
		 
//		 <문제>
		 
		 
		 //자신이 태어난 날을 yyyy/MM/dd 형태로 입력받아 
		 //해당 날짜가 무슨 요일이었는지,
		 //지금까지 며칠이 지났는지 계산 
		 //입력된 형식이 잘못된 경우 다시 입력받기 
		 public void practice() {
			 
			//<강사님 풀이 >
			 Scanner sc = new Scanner(System.in);
			 SimpleDateFormat sdf = new  SimpleDateFormat("yyyy/MM/dd");
			 Date result = null;
			 
			 while(true){
				 System.out.print("날짜를 yyyy/MM/dd 형태로 작성 : ");
				 String data = sc.nextLine();
				 try {
				    result =  sdf.parse(data);
				    break;
				 }catch(ParseException e) {}
			 }
			 
			 Calendar inputdate = Calendar.getInstance();
			 Calendar today = Calendar.getInstance();
			 
			 inputdate.setTime(result);
			 
			 SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd은 E요일 입니다.");
			 System.out.println(sdf2.format(result));
			 
			 long day = (today.getTimeInMillis() - inputdate.getTimeInMillis())/(1000 *24*60*60);
			 System.out.println("태어난 날부터 지금까지" + day + "일 지났습니다.");
			 
			 
//			 final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"}; 
//			 Scanner sc = new Scanner(System.in);
//			 
//			 try {
//			 System.out.print("태어난 날 : ");
//			 String date = sc.nextLine();
//			 String [] strArr = date.split("/");
//			 int year = Integer.parseInt(strArr[0]);
//			 int month = Integer.parseInt(strArr[1]);
//			 int day = Integer.parseInt(strArr[2]);
//			 
//			 Calendar cal1 = Calendar.getInstance();
//			 cal1.set(year, month-1, day);
//			 System.out.println( DAY_OF_WEEK[cal1.get(Calendar.DAY_OF_WEEK)] + "요일");
//			 
//			 Calendar today = Calendar.getInstance();
//			 
//			 long difference = (today.getTimeInMillis()-cal1.getTimeInMillis()) /1000;
//			 
//			 System.out.println(difference/(24*60*60) + "일 지났습니다.");
//			 
//			 }catch(NumberFormatException e) {
//				 e.printStackTrace();
//				 
//				 practice();
//			 }
		 
			 
		 }
		 
		 
		 public void practice1() {
//			 10시 20분 30초
//			 20시 30분 10초
			 
			 final int[] TIME_UNIT = {3600,60,1};
			 final String[] TIME_UNIT_NAME = {"시간","분","초"};
			 
			 
			 Calendar cal1 = Calendar.getInstance();
			 Calendar cal2 = Calendar.getInstance();
			 
			 cal1.set(Calendar.HOUR_OF_DAY,10);
			 cal1.set(Calendar.MINUTE,20);
			 cal1.set(Calendar.SECOND,30);
			 
			 cal2.set(Calendar.HOUR_OF_DAY,20);
			 cal2.set(Calendar.MINUTE,30);
			 cal2.set(Calendar.SECOND,10);
			 
			 
			 long difference = Math.abs(cal1.getTimeInMillis() - cal2.getTimeInMillis())/1000;
			 System.out.println("cal1 - cal2의 차이는 " + difference+"초 입니다.");
			 
			 
			 String tmp ="";
			 for(int i = 0;i<TIME_UNIT.length;i++) {
				 tmp += difference/TIME_UNIT[i] + TIME_UNIT_NAME[i];
				 difference %= TIME_UNIT[i];
			 }
			 
			 System.out.println (tmp);
			 
		 }
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

