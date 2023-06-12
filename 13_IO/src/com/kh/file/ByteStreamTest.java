package com.kh.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 바이트 기반 스트림
 * - 데이터를 바이트(byte) 단위로 주고 받는다.
 * - 그림, 멀티미디어 등 바이너리 데이터를 읽고 출력할 때 사용
 * - InputStream, OutStream : 바이트 기반 입출력 스트림의 최상위 클래스
 * 
 * 보조 스트림
 * - 스트림의 기능을 향상시키거나 새로운 기능을 추가하기 위해 사용 
 * - 독립적으로 입출력을 수행할 수 없음 
 * 
 * */
public class ByteStreamTest {

	// 바이너리 데이터(이미지 파일)을 읽어서 파일로 출력하는 문제 
	public static void main(String[] args) {
  //*다운로드의 기본 조직 
		String fileName = "src/bird.jpg";
		String outfileName = "src/bird_output.jpg";
		
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			//먼저 기반 스트림을 생성 
//			FileInputStream,FileOutputStream : 파일에 입출력을 하기 위한 스트림 
			FileInputStream fis = new FileInputStream(fileName); // 입력 , 경로 생성 
			FileOutputStream fos = new FileOutputStream(outfileName);
			
			// 기반 스트림을 이용해서 보조스트림을 생성 
			//DataInputStream, DataInputStream : 기본형 타입으로 읽고 쓰는 보조 스트림 
			 dis = new DataInputStream(fis); //기반스트림을 보조 스트림에 담음
			 dos = new DataOutputStream(fos);
			
			// 데이터를 읽어서 출력 
			int data = 0;
			while((data = dis.read()) != -1) { // -1일때까지 계속 읽음 
				dos.write(data); 
			}
				
		}catch(EOFException e) { // 입력 도중 예상외의 파일 종료 예외 , 잘 안잡아줘서 우리가 수동으로 잡아주는게 좋음 
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				dis.close(); // 마지막으로 finally에서 닫아줘야 함 
			} catch (IOException e) { //예외잡고 
				e.printStackTrace();
			}
			try {
				dos.close(); // 마지막으로 finally에서 닫아줘야 함
			} catch (IOException e) {//예외잡고 
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	

}
