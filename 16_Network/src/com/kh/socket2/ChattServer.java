package com.kh.socket2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattServer {

	//클라이언트가 보낸 메세지를 받아서 
    //다시 클라이언트에게 받은 메세지를 보낸다.
	
	public static void main(String[] args) {

		//+PrinterWriter
	
		try {
			//1.ServerSocket
			ServerSocket server = new ServerSocket(60000);
			
			//2. 클라이언트가 서버에 접속하면 accept로 받아서 Socket을 하나 리턴
			Socket s = server.accept();
			
			//3. 소켓으로부터 스트림 리턴 BufferedReader
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true); //***다시 던지기
			
			String line = null;
			
			
			
			while((line = br.readLine()) != null) {
			
				System.out.println("[" + s.getInetAddress()+" ]가 보낸 메세지" + line);
				 
				pw.println(line); //**
				
			
			}
			
			
			
		} catch (IOException e) {
			
		
		}
		

	}

}
