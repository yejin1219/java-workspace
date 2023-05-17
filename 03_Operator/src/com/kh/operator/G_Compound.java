package com.kh.operator;

public class G_Compound {

	
	/*
	 * 복합 대입 연산자
	 *  - 산술연산자와 대입연산자가 결합되어 있는 형태
	 *  - 연산처리 속도가 빨라지므로 사용하는 걸 권장!!
	 *  
	 * += -= *= /= %=
	 * 
	 * a = a + 3; => a +=3;
	 * a = a - 3; => a -=3;
	 * a = a * 3; => a *=3;
	 * a = a / 3; => a /=3;
	 * a = a % 3; => a %=3;
	 */
   public static void main(String[]args) {
	   
	   int number =12;
	   String str = "Hello";
	 
	   number += 3;// number = number + 3;
	   System.out.println(number); // 15
	   
	   number -=5; // number = number - 5;
	   System.out.println(number); // 10
	   
	   number *= 6; // number = number * 6;
	   System.out.println(number); //60
	   
	   number /= 3;//number = number / 3;
	   System.out.println(number); //20
	   
	   number %= 3; // number = number % 3;
	   System.out.println(number); //2	   
	   
			   
	   str += ", World!"; // str = str + ", World!";
	   System.out.println(str); // Hello, World!
			   
			   
	  
   }
   
  
}
