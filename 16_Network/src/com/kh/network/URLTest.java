package com.kh.network;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * URL(Uniform Resource Locator)
 * - 인터넷에 존재하는 서버들의 자원에 접근할 수 있는 주소
 * 
 * https://www.youtube.com/results?search_query=여행
 * 프로토콜://호스트명:포트번호/경로명/파일명?쿼리스트링
 * - 프로토콜 : 자원에 접근하기 위해 서버와 통신하는데 사용되는 통신규약
 *           (https)
 * - 호스트명 : 자원을 제공하는 서버의 이름(www.youtube.com)
 * - 포트번호 : 통신에 사용되는 서버의 포트번호 (443)
 * - 경로명 : 접근하려는 자원이 저장된 서버상의 위치(results) 
 * - 쿼리(qurey) : ? 이후의 부분(search_qurey=여행)         
 * */


public class URLTest {

	public static void main(String[] args) {

		URLTest u = new URLTest();
		u.method1();

	}
	
	public void method1() {
		
		try {
			URL url = new URL("https://www.youtube.com/results?search_query=여행");
			
			
			System.out.println("url.getProtocol() :" + url.getProtocol()); // url.getProtocol() :https
			System.out.println("url.getHost() :" + url.getHost()); // url.getHost() :www.youtube.com
			System.out.println("url.getDefaultport() :" + url.getDefaultPort()); // url.getDefaultport() :443
			System.out.println("url.getFile() :" + url.getFile()); //url.getFile() :/results?search_query=여행
			System.out.println("url.getPath() :" + url.getPath()); //url.getPath() :/results
			System.out.println("url.getQuery() :" + url.getQuery()); //url.getQuery() :search_query=여행

			
			
			
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	}

}
