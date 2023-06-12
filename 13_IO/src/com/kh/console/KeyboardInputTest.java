package com.kh.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * IO (Input / Output)
 * - 입력과 출력
 * - 두 대상 간의 데이터를 주고 받는 것
 * - 입력 : 키보드, 파일, 네트워크
 * - 출력 : 모니터, 파일, 네트워크
 * 
 * 스트림(stream)
 * - 데이터를 운반하는 연결 통로
 * - 연속적인 데이터 흐름을 물(stream)에 비유
 * - 하나의 스트림으로 입출력을 동시에 수행할 수 없음(단방향 통신)
 * - 입툴력을 동시에 수행하려면, 2개의 스트림이 필요
 * 
 * 
 * */
public class KeyboardInputTest {

	// 키보드로 데이터를 읽어들여서 콘솔로 출력하는 로직
	public static void main(String[] args) {

		// 1. 스트림 생성 : 입력 스트림만 필요
		InputStreamReader ir = new InputStreamReader(System.in); //기반 스트림
		BufferedReader br = new BufferedReader(ir); //보조 스트림
		
		// 2. 읽어들인다 : readLine()
		try {
			String line = br.readLine();
			while(line!=null) {
				// 3. 콘솔로 출력 : System.out.println();
				System.out.println("Reading Data : " + line);
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			br.close(); // 4. finally 하고 넣어줌
			try { // 5. 트라이 캐치 로 잡아줌 
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
