package com.kh.file;

import java.io.File;
import java.io.IOException;

/*
 * File 클래스
 * - 파일과 디렉토리를 다루는데 사용되는 클래스 
 * */


public class FileTest {

	public static void main(String[] args) {

		// 존재하는 경로까지 지정해 주면 해당 위치에 파일을 생성한다. 
		File file = new File("src/test.txt"); //  test.txt이렇게만 쓰면 경로를 모름 src/(경로 지정)해줘야 함
		
		System.out.println("파일명 : " + file.getName()); //파일을 가져오는 메서드 getName()
		System.out.println("절대 경로" + file.getAbsolutePath()); //절대경로를 가져오는 메서드 getAbsolutePath()
		System.out.println("상대 경로 : " + file.getPath());
		System.out.println("파일 용량 : " + file.length());
		System.out.println("파일 존재 여부 : " + file.exists());
		System.out.println("파일 여부 : " + file.isFile());
		System.out.println("디렉토리 여부 : " + file.isDirectory());
		
		//* 절대 경로 : 파일의 전체 경로 , 상대 경로 : 파일의 지금 현 위치 는 자주 나오는 개념 *
		
		System.out.println();
		
		//만약 존재하지 않는 경로를 제시하면 IOException 발생
		File newFile = new File("src/temp/test.txt"); //temp라는 파일 없음
//		newFile.isDirectory(); // temp라는 파일 없어 에러 발생 
		
		// 폴더 만들기
		File tempDir = new File("src/temp");
		tempDir.mkdir();
		
		//파일 생성하기
		try {
			newFile.createNewFile(); // <-이것만 쓰면 에러 발생>, 트라이 캐취로 잡아줌 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// => temp라는 폴더 밑에 test라는 파일 생성 됨 
		
		
	}
	
	
}
