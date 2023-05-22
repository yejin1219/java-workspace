package com.kh.loop;

import java.util.Scanner;

class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	
	
	public static void main(String[]args) {
		LoopPractice c = new LoopPractice();
//		c.method1();
//		c.method2();
//		c.method3();
		c.method4(); 
//		c.method5();
//		c.method6();
	}
	
	
    /*
        사용자로부터 숫자(1~100) 1개가 입력되었을 때 카운트다운 출력하시오.
        사용자 입력 : 5
        5
        4
        3
        2
        1
     */
    public void method1() {
    	
    	
    	System.out.print("사용자 입력 : ");
    	int num = sc.nextInt();    
    	
    	for(int i=num; i>0; i--) {
    		System.out.println(i);
    	}
    }

    // 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상 되는지 출력하시오.
    public void method2() {
    	
    	int num = 0;
    	int sum = 0;
    	int s=1;
    	int i =0;
    	while(true) {
    		s=-s;
    		num = i*s;
    		sum+=num;
    		i++;
    		if(sum>=100)
    			break;
    	}
    	
    	System.out.println(num);
    	System.out.println(sum);

    }

    /*
        사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요. 

        문자열 : banana
        문자 : a
        banana 안에 포함된 a 개수 : 3

    */
    public void method3() {
    	
    	System.out.print("문자열 : ");
    	String str = sc.nextLine();
    	int a = str.length();
    	
    	System.out.print("문자 : ");
    	String str1 = sc.nextLine();
    	char ch = str1.charAt(0);
    	int count = 0;
    	for(int i=0; i<a;i++) {
    		
    		if(ch != str.charAt(i)) 
    			continue;
    	
    		   count++;
    		  
    	}
    	 System.out.println(str+ "안에 포함된 "+ ch+ " 개수 : "+ count);

    }

    /*
        0이 나올 때까지 숫자를 출력하시오. (random 사용! 1~10)
        7
        3
        4
        2
        3
        4
        0
     */
    public void method4() {
    	
    	int num=0;
    	
 	   do {
 		   num = (int)(Math.random()*11) ;
 		   System.out.println(num);
 	   }while(num!=0);
 

    }

    /*
        주사위를 10번 굴렸을 때 각 눈의 수가 몇 번 나왔는지 출력하세요. (random 사용!)

        1 : 3
        2 : 2
        3 : 1
        4 : 0
        5 : 4
        6 : 0

     */
    public void method5() {
    	
    	
    	int a=0;
    	int b=0;
    	int c=0;
    	int d=0;
    	int e=0;
    	int f=0;
    	for(int i=1; i<=10; i++) {
    		 int num = (int)(Math.random()*6)+1 ;
    		switch(num) {
    		case 1: ++a; break;
    		case 2: ++b; break;
    		case 3: ++c; break;
    		case 4: ++d; break;
    		case 5: ++e; break;
    		case 6: ++f; break;
    		
    		}
    	}
    	System.out.println("1:" + a);
		System.out.println("2:" + b);
		System.out.println("3:" + c);
		System.out.println("4:" + d);
		System.out.println("5:" + e);
		System.out.println("6:" + f);
    	

    	
    }

    /*
        사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 
        컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
        사용자가 이겼을 때 반복을 멈추고 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.


        당신의 이름을 입력해주세요 : 
        가위바위보 : 가위
        컴퓨터 : 가위
        박신우 : 가위
        비겼습니다.

        가위바위보 : 가위 
        컴퓨터 : 바위
        박신우 : 가위
        졌습니다 ㅠㅠ

        가위바위보 : 보
        컴퓨터 : 바위
        박신우 : 보
        이겼습니다 !
    */
    public void method6() {
    	
    	System.out.print("당신의 이름을 입력해주세요 : ");
    	String str = sc.nextLine();
    	int win = 0;
    	int lose =0;
    	int tie =0;
    	outer:
    	while(true) {
    
    	 int num = (int)(Math.random()*3)+1; 
    	
    	
    	 System.out.print("가위바위보 : ");
    	 String input = sc.nextLine();
    	 System.out.print("컴퓨터 : ");
    	 String com = sc.nextLine();
    	 System.out.println(str + " : " + input);
    	
    	 switch(com) {
    	   case "바위":
    		 num =1; break;
    	   case "가위":
    		num =2; break;
    	   case "보":
    		num =3; break;
   
    	    }
    
    	 
    	
    	  switch(input) {
    	      case "바위" : 
    		    if(num == 1) {
    			 System.out.println("비겼습니다.");
    			 ++tie;
    		    }else if(num==2) {
    			 System.out.println("이겼습니다!");
    			 ++win;
    			 break outer;
    		    }else if(num==3) {
    			 System.out.println("졌습니다 ㅠㅠ");
    			 ++lose;
    		    } 
    		    break;
    	
    	
    	       case "가위" : 
    		    if(num == 1) {
    			 System.out.println("졌습니다 ㅠㅠ");
    			 ++lose;
    		    }else if(num==2) {
    			 System.out.println("비겼습니다.");
    			 ++tie;
    		    }else if(num==3) {
    			 System.out.println("이겼습니다!");
    			 ++win;
    			 break outer;
    		    } 
    		    break; 
    	
    	      case "보" : 
    		    if(num == 1) {
    			 System.out.println("이겼습니다!");	
    			 ++win;
    			 break outer;
    		    }else if(num==2) {
    			 System.out.println("졌습니다 ㅠㅠ");
    			 ++lose;
    		    }else if(num==3) {
    			 System.out.println("비겼습니다.");
    			 ++tie;
    		    } 
    		    break;
    	
    	       } 
    	    System.out.println();
    
      } 
    	System.out.println("이긴 횟수 : "+ win);
    	System.out.println("진 횟수 : "+ lose);
    	System.out.println("비긴 횟수 : "+ tie);

    }

}