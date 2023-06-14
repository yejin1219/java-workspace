package com.kh.step3;

import java.awt.Toolkit;

public class BeepPrintTest1 {

	public static void main(String[] args) {
	

		BeepPrintThread bpt = new BeepPrintThread();
		BeepThread bt = new BeepThread();
		
		
		
		Thread bpThread = new Thread(bpt, "BeepPrintThread");	
		Thread bThread = new Thread(bt, "BeepThread");
		
		
		bpThread.start();
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		for(int i =0; i<5; i++) { // 경고음 5번 울리게 하는 것
			tool.beep(); 
			try {
				Thread.sleep(1000); //1초마다 
			} catch (InterruptedException e) {}
			
			
		
		}
	
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
