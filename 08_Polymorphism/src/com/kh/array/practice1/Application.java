package com.kh.array.practice1;

import java.util.Arrays;

import com.kh.array.practice1.model.Student;

public class Application {

	public static void main(String[] args) {

		// 객체 배열 
		Student[] stuArr = new Student[5];
		
		stuArr[0] = new Student("김길동", "자바", 100);
		stuArr[1] = new Student("박길동", "디비", 90);
		stuArr[2] = new Student("이길동", "화면", 95);
	    stuArr[3] = new Student("정길동", "서버", 85);
	    stuArr[4] = new Student("홍길동", "디비", 20);
	    
	    System.out.println(stuArr); //[Lcom.kh.array.practice1.model.Student;@6f2b958e
	    System.out.println(Arrays.toString(stuArr)); //[Student [name=김길동, subject=자바, score=100], Student [name=박길동, subject=디비, score=90], Student [name=이길동, subject=화면, score=95], Student [name=정길동, subject=서버, score=85], Student [name=홍길동, subject=디비, score=20]]

	    
	    System.out.println();
	    
	    //for문으로 하나씩 뽑아내기 
	    
	    for(Student student : stuArr) {
//	    	System.out.println(student);
//	    	Student [name=김길동, subject=자바, score=100]
//	    	Student [name=박길동, subject=디비, score=90]
//	        Student [name=이길동, subject=화면, score=95]
//	        Student [name=정길동, subject=서버, score=85]
//	    	Student [name=홍길동, subject=디비, score=20]
	    }
	}

}



