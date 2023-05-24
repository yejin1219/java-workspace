package com.kh.condition;

import java.util.Scanner;



public class ConditionPractice {

	
	Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		ConditionPractice c = new ConditionPractice();
//		c.practice1();
//		c.practice2();
//		c.practice3();
//		c.practice4();
//		c.practice5();
//		c.practice6();
//		c.practice7();
//		c.practice8();
//		c.practice9();
		c.practice10();
//		c.practice11();
	}
	
	    
	
    /*
       키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
       짝수가 아니면 “홀수다“를 출력하세요.
       양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
    
       숫자를 한 개 입력하세요 : -8
       양수만 입력해주세요.
     */
	
	
	
    public void practice1() {
        
    	System.out.print("숫자를 한 개 입력하세요 : ");
    	int num = sc.nextInt();
    	
    	if(num > 0 ) {
    		if(num%2 ==0) {
    			System.out.println("짝수다");
    		}else {
    			System.out.println("홀수다");
    		}
    	}else {
    		System.out.println("양수만 입력해주세요.");
    	}
    }

    /*
        정수 num1과 num2가 매개변수로 주어진다. 두 수가 같으면 1 다르면 -1을 출력하세요.

        num1 : 2
        num2 : 3
        -1

        num1 : 11
        num2 : 11
        1
     */
    public void practice2() {
        
    	System.out.print("num1 : ");
    	int num1 = sc.nextInt();
    	
    	System.out.print("num2 : ");
    	int num2 = sc.nextInt();
    	
    	if(num1==num2) {
    		System.out.println(1);
    	}else {
    		System.out.println(-1);
    	}
    }

    /*
        A 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라준다.
        피자 조각 수와 피자를 먹는 사람의 수를 입력받아 한 사람 당 최소 한 조각 이상 피자를 먹으려면 
        최소 몇 판의 피자를 시켜야 하는지 출력하세요.

        피자 조각 수 : 7
        피자 먹는 사람 수 : 10
        2

     */
    public void practice3() {
        
    	
    	
    	System.out.print("피자조각 수 : ");
    	int slice = sc.nextInt();
    	
    	System.out.print("피자 먹는 사람 수 : ");
    	int people = sc.nextInt();
    	
    	int pizza = people/slice;
    	
    	if(people % slice > 0) {
    		System.out.println(pizza + 1);
    	}else {
    		System.out.println(pizza);
    	}
    	
    	
    }

    /*
        국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
        합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
        (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
        합격 했을 경우
         과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
        불합격인 경우에는
         “불합격입니다.”를 출력하세요.
    
        국어점수 : 88 
        수학점수 : 50 
        영어점수 : 40 
        불합격입니다.

        국어점수 : 88
        수학점수 : 50
        영어점수 : 45
        국어 : 88
        수학 : 50
        영어 : 45
        합계 : 183
        평균 : 61.0
        축하합니다, 합격입니다!
     */
    public void practice4() {
  
    	System.out.print("국어점수 : ");
    	int koreanScore = sc.nextInt();
    	
    	System.out.print("수학점수 : ");
    	int mathScore = sc.nextInt();
    	
    	System.out.print("영어점수 : ");
    	int englishScore = sc.nextInt();

    	int total = koreanScore + mathScore + englishScore;
    	float average = total/3;
    	
    	if(koreanScore>=40 && mathScore>=40 && englishScore>=40 && average>=60 ) {
    		System.out.printf(" 국어 : %d\n 수학 : %d\n 영어 : %d\n 합계 : %d\n 평균 : %.1f\n",koreanScore,mathScore,englishScore,total,average);
    		System.out.println(" 축하합니다, 합격입니다! ");
    	}else {
    		System.out.println("불합격입니다.");
    	}
    	
    }

    /*
        B 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만원 이상 사면 20%를 할인해준다.
        구매한 옷의 가격을 입력했을 때, 지불해야 할 금액을 출력하세요.
        
        구매한 옷 가격 : 580,000
        464,000
     */
    public void practice5() {

    	System.out.print("구매한 옷 가격 : ");
    	int price = sc.nextInt();
    	
    	int result = 0;
    	
    	if(price>=500000) {
    		result = (int)(price-price*0.2f);
    	}else if(price>=300000) {
    		result = (int)(price-price*0.1f);
    	}else if(price>=100000) {
    		result = (int)(price -price*0.05f);
    	}else {
    		result = price;
    	}
    	
    	System.out.println(result);
    	
    }


    /*
        각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류한다.
        입력받은 각에 따라 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 출력하세요.
     */
    public void practice6() {

    	System.out.print("각도 : ");
    	int angle = sc.nextInt();
    	int result = 0;
    	
    	if(angle>0 && angle<90) {
    		result = 1;
    	}else if(angle==90){
    		result = 2;
    	}else if(angle>90 && angle<=180) {
    		result = 3;
    	}else if(angle==180) {
    		result = 4;
    	}
    	
    	System.out.print(result);
    }


    /*
      아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
      로그인 성공 시 “로그인 성공”, 
      아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
      비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.

      아이디 : happy
      비밀번호 : 1234
      로그인 성공!
 
      아이디 : happy
      비밀번호 : 23467
      비밀번호가 틀렸습니다.

      아이디 : happy222
      비밀번호 : 1234
      아이디가 틀렸습니다.
    */
    public void practice7() {
 
    	String id = "happy";
    	String passWorld = "1234";
    	
    	System.out.print("아이디 : ");
    	String id1 = sc.nextLine();
    	
    	System.out.print("비밀번호 : ");
    	String passWorld1 = sc.nextLine();
    	
    	if(id1.equals(id) && passWorld1.equals(passWorld)) {
    		System.out.println("로그인 성공!");
    	}else if(!(passWorld1.equals(passWorld))) {
    		System.out.println("비밀번호가 틀렸습니다.");
    	}else if(!(id1.equals(id))) {
    		System.out.println("아이디가 틀렸습니다.");
    	}
    }

    /*
        키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
        저체중 / 정상체중 / 과체중 / 비만을 출력하세요.
        BMI = 몸무게 / (키(m) * 키(m))
        BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
        BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
        BMI가 30이상일 경우 고도 비만

        키(m)를 입력해 주세요 : 1.62
        몸무게(kg)를 입력해 주세요 : 46
        BMI 지수 : 17.527815881725342
        저체중

     */
    public void practice8() {
       
    	double height = 0;
    	double weight = 0;
    	
    	System.out.print("키(m)를 입력해 주세요 : ");
    	height = sc.nextDouble();
    	System.out.print("몸무게(kg)를 입력해 주세요 : ");
    	weight = sc.nextDouble();
    	
    	double bmi = weight / (height*height);
    	System.out.println("BMI 지수 : " + bmi);
    	String str = "";
    	
    	if(bmi>=30) {
    		str = "고도비만";
    	}else if(bmi>=25) {
    		str = "비만";
    	}else if(bmi>=23) {
    		str = "과체중";
    	}else if(bmi>=18.5) {
    		str = "정상체중";
    	}else {
    		str = "저체중";
    	}
    	System.out.println(str);
    }

    /*
        키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
        (단, 양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산 기호를 입력 했을 시
        “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)

        피연산자1 입력 : 15
        피연산자2 입력 : 4
        연산자를 입력(+,-,*,/,%) : /
        15 / 4 = 3

     */
    public void practice9() {

    	int num1=0;
    	int num2=0;
    	char ch = '+';
    	int a = num1 + num2;
    	int b = num1 - num2;
    	int c = num1 * num2;
    	int d = num1/num2;
    	int e = num1%num2;  
    	
    	System.out.print("피연산자1 입력 : ");
    	 num1 = sc.nextInt();
    	if( num1<0) {
    		System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
    	}else {
    		System.out.print("피연산자2 입력 : ");
        	  num2 = sc.nextInt();
    	}
    	
    	if(num2<0) {
    		System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
    	}else {
    		System.out.print("연산자를 입력 : ");
    		String str = sc.nextLine();
    		ch = str.charAt(0);
    		
    		switch(ch) {
    		case '+': 
    			System.out.println(num1 + ch + num2 + "=" + a ); 
  		        break;
    		case '-': 
    			System.out.println(num1 + ch + num2 + "=" + b ); 
  		        break;
    		case '*': 
    			System.out.println(num1 + ch + num2 + "=" + c ); 
  		        break;
    		case '/': 
    			System.out.println(num1 + ch + num2 + "=" + d ); 
  		        break;
    		case '%':
    			System.out.println(num1 + ch + num2 + "=" + e ); 
  		        break;
    		default : 
    			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
    			
    		}
    	}
    
    }

    /*
      아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
      종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요

        1. 입력
        2. 수정
        3. 조회
        4. 삭제
        9. 종료
        메뉴 번호를 입력하세요 : 3
        조회 메뉴입니다.
     */
    public void practice10() {

    	System.out.println("1.입력");
    	System.out.println("2.수정");
    	System.out.println("3.조회");
    	System.out.println("4.삭제");
    	System.out.println("9.종료");
    	
    	System.out.print("메뉴 번호를 입력하세요 : ");
    	int menuNumber = sc.nextInt();
    	
    	
    	switch(menuNumber) {
    	case 1 : System.out.println("입력메뉴입니다."); break;
    	case 2 : System.out.println("수정메뉴입니다."); break;
    	case 3 : System.out.println("조회메뉴입니다."); break;
    	case 4 : System.out.println("삭제메뉴입니다."); break;
    	case 9 : System.out.println("프로그램이 종료됩니다."); break;
    	}
    	
    }

    /*
        중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
        총 점 100점 중 배점으로는 다음과 같다.
        중간고사 (20%), 기말고사 (30%), 과제 (30%), 출석 (20%)

        이 때, 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 입력

        총 점이 70점 이상이면서 전체 강의의 70%이상 출석을 했을 경우 Pass,
        아니면 Fail을 출력하세요.


        중간 고사 점수 : 80
        기말 고사 점수 : 90
        과제 점수 : 50
        출석 회수 : 15
        ===========결과==========
        중간 고사 점수(20) : 16.0
        기말 고사 점수(30) : 27.0
        과제 점수 (30) : 15.0
        출석 점수 (20) : 15.0
        총점 : 73.0
        PASS

        중간 고사 점수 : 80
        기말 고사 점수 : 30
        과제 점수 : 60
        출석 회수 : 18
        ===========결과==========
        FAIL [점수 미달] (총점 61.0)

        중간 고사 점수 : 90
        기말 고사 점수 : 100
        과제 점수 : 80
        출석 회수 : 13
        ===========결과==========
        FAIL [출석 횟수 부족] (13/20)

        중간 고사 점수 : 100
        기말 고사 점수 : 80
        과제 점수 : 40
        출석 회수 : 10
        ===========결과==========
        FAIL [출석 횟수 부족] (10/20)
        FAIL [점수 미달] (총점 66.0)

     */
    public void practice11() {
        
    	System.out.print("중간 고사 점수 : ");
    	double middleScore = sc.nextDouble()*0.2f;
    	System.out.print("기말 고사 점수 : ");
    	double finalScore = sc.nextDouble()*0.3f;
    	System.out.print("과제 점수 : ");
    	double taskScore = sc.nextDouble()*0.3f;
    	System.out.print("출석 횟수 : ");
    	double countScore = sc.nextDouble();
    	System.out.println("==========결과=========");
    	
    	double total = middleScore + finalScore + taskScore + countScore;
    	
    	if(total>=70 && countScore>=(int)(20*0.7f)) {
    		
    		System.out.printf("중간 고사 점수(20) : %.1f%n", middleScore);
        	System.out.printf("기말 고사 점수(30) : %.1f%n", finalScore);
        	System.out.printf("과제 점수(30) : %.1f%n", taskScore);
        	System.out.printf("출석 점수(20) : %.1f%n", countScore);
        	System.out.printf("총점 : %.1f%n",total);
    		System.out.println("PASS");
    	}else {
    		
    		if(total<=70) {
    		  System.out.printf("FAIL [점수미달] (총점 : %.1f )", total);
    		 }
    		if(countScore<=(int)(20*0.7f)){
    		  System.out.printf("FAIL [출석 횟수 부족] (%.0f / 20)", countScore);
    		 }
    		
    		}

    }
    
 }
