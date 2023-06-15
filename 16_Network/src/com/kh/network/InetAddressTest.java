package com.kh.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/*
 * 네트워크(Network)
 * - 여러 대의 컴퓨터를 통신 회선으로 연결하는 것
 * 
 * 서버(Server)와 클라리언트(Client)
 * - 서비스를 제공하는 쪽이 서버, 제공받는 쪽이 클라이언트
 * - 클라이언트가 요청(Request)하는 내용을 서버에서 처리하고 응답(Response)을
 *   클라이언트로 보낸다.
 *   
 *  IP 주소
 *  - 네트워크 상에서 컴퓨터를 식별하는 번호
 *  - xxx.xxx.xxx.xxx와 같은 형식으로 표현
 *    (xxx는 부호 없는 0~255 사이의 정수)
 *  - DNS(Domain Name System)를 통해 해당 도메인의 IP주소를 알아낼 수 있다.
 *     
 *  포트(Port)
 *  - IP 주소는 네트워크 상에서 컴퓨터를 찾을 때만 사용하고 컴퓨터 내에서
 *    실행하는 프로그램을 선택하기 위해 포트(Port)를 사용
 *  - 클라이언트는 서버 연결 요청 시 IP 주소와 포트 번호를 알고 있어야 한다.
 *  - 포트는 0 ~ 65535까지의 범위를 갖는다.
 *  
 *  InetAdress : IP 주소를 다루기 위한 클래스
 *  
 * */



public class InetAddressTest {

	public static void main(String[] args) {
	
		InetAddressTest i = new InetAddressTest();
		i.method1();
//		i.method2();

	}
	
	public void method1() {
	
		

		try {
			InetAddress ip = InetAddress.getByName("google.com");
			System.out.println("getHostName() : " + ip.getHostName());//getHostName() : google.com // 호스트 이름을 반환하는 역할 
			System.out.println("getHostAddress() : " + ip.getHostAddress());//getHostAddress() : 172.217.27.46 //호스트의 IP주소 반환

			ip = InetAddress.getLocalHost();
			System.out.println("getHostName() : " + ip.getHostName()); //getHostName() : DESKTOP-DSALL0S
			System.out.println("getHostAddress() : " + ip.getHostAddress()); //getHostAddress() : 192.168.10.17
			
			System.out.println();
			
			InetAddress[] ipArr = InetAddress.getAllByName("naver.com");
			// getAllByName() = getHostName() 과 getHostAddress() 둘 다 가져올 수 있는 메서드 
			
			
			for(int i=0; i<ipArr.length; i++) {
				
				System.out.println("ipArr[" + i + "] :" + ipArr[i].getHostAddress());
//				ipArr[0] :223.130.200.107
//				ipArr[1] :223.130.195.200
//				ipArr[2] :223.130.195.95
//				ipArr[3] :223.130.200.104
				
	
			}
			
		} catch (UnknownHostException e) {
		
			e.printStackTrace();
		}
	}
	
	
	
	public void method2() {
		
		BufferedReader input = null;
	
	
		
		try {  
			URL url = new URL("https://iei.or.kr"); //외부 호스트의 페이지 내용 가져오기 1. url 객체 생성
			input = new BufferedReader(new InputStreamReader(url.openStream()));//openStream():해당 url 페이지 정보 가져오기 
			
			String line = "";
			while((line = input.readLine())!=null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				input.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
