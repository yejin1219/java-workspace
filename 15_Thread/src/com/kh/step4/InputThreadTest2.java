package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest2 {

	public static void main(String[] args) {
		
		
		Thread t = new Thread(new CountingThread1());
		t.start();
		
		// 1. 데이터 입력
		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요...");
		System.out.println("입력하신 숫자는" + input + "입니다.");
		
		
	}

}



class CountingThread1 implements Runnable{

	@Override
	public void run() {

		// 2. 카운팅 작업
				for(int i=10; i>0;i--) {
					try {
						
							Thread.sleep(1000);
						
						
						
					} catch (InterruptedException e) {}
					System.out.println(i);
					
				}
	}
	
}
