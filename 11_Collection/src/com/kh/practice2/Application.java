package com.kh.practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		Application app = new Application();
//		app.method1();
		app.method2();
	}
	
	
	
     public void method1() {
		Set<Integer> lotto = new TreeSet<>();
		
		
	   for(int i=0; lotto.size()<6; i++) {
		    int num = (int)(Math.random()*45)+1;
		    
		   lotto.add(num);
		   
	   }
	  
	   
	   
	   boolean input = true;
	   int count = 0;
	   while(input) {
		   Set<Integer> set1 = new TreeSet<>();
		 
		   count++;
		   while(set1.size() < 6) {
			   int choose = (int)(Math.random()*45) +1;
			   set1.add(choose);
		   }
		  
		  
		   System.out.println("내 번호 : " + lotto);
		   System.out.println("로또 번호 : " + set1);
		  
		   
		   
		   if(lotto.equals(set1)) {
			   System.out.println("횟수 : " + count);
			   input=false;
				  return;
		   } 
   
	   }   
	}
     
     public void method2() {
    	 
    	 HashSet<Integer> lotto = new HashSet<>();
 		
 		
  	   for(int i=0; lotto.size()<6; i++) {
  		    int num = (int)(Math.random()*45)+1;
  		    
  		   lotto.add(num);
  		   
  	   }
  	  
  	   List lottolist = new ArrayList(lotto);
  	   Collections.sort(lottolist);
  	   
  	   boolean input = true;
  	   int count = 0;
  	   while(input) {
  		 HashSet<Integer> set1 = new HashSet<>();
  		 
  		   count++;
  		   while(set1.size() < 6) {
  			   int choose = (int)(Math.random()*45) +1;
  			   set1.add(choose);
  		   }
  		   
  		   List myLottoList = new ArrayList(set1);
  		 Collections.sort(myLottoList);
  		  
  		  
  		   System.out.println("내 번호 : " + lotto);
  		   System.out.println("로또 번호 : " + myLottoList);
  		  
  		   
  		   
  		   if(lotto.equals(set1)) {
  			   System.out.println("횟수 : " + count);
  			   input=false;
  				  return;
  		   } 
     
  	   }   
    	 
     }
     
     
     
}
	


