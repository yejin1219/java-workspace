package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest {

	boolean inputCheck = false;
	
	public static void main(String[] args) {
		
		
		InputThreadTest process = new InputThreadTest();
		
		Thread t = new Thread(new CountingThread(process));
		Thread t1 = new Thread(new InputThread(process));
		
		t.start();
		t1.start();
		
		
	}

}



class CountingThread implements Runnable{

	InputThreadTest process;
	CountingThread(InputThreadTest process2){
		this.process = process2;
	}
	
	
	
	@Override
	public void run() {

		// 2. 카운팅 작업
				for(int i=10; i>=0;i--) {
					try {
						if(process.inputCheck) break;
						System.out.println(i);
	
						Thread.sleep(1000);
					} catch (InterruptedException e) {}

				}
				
				if(!process.inputCheck) {
					System.out.println("10초 경과되었습니다.. 값 입력 초과");
					System.exit(0); //강제 종료 메서드(0이 들어감 )
				}
				
	}
	
}




class InputThread implements Runnable{

	InputThreadTest process;
    InputThread(InputThreadTest process){
		this.process = process;
	}
	
	
	@Override
	public void run() {
		// 1. 데이터 입력
				String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요...");
				System.out.println("입력하신 숫자는" + input + "입니다.");
		
				process.inputCheck = true;
	}
	
}