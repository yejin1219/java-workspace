package com.kh.lambda.standard;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

import com.kh.model.Student;

public class D_Operator {

	/*Operator
	 * -Operator 함수적 인터페이스는 매개값과 리턴 값이 있는 applyXXX() 추상메서드를 가지고 있다.
	 * -applyxxx() 추상 메서드는 주로 매개값을 이용해서 연산하고
	 *  동일한 타입으로 결과를 리턴하는 역할을 한다. 
	 * 
	 * */
	public static void main(String[] args) {

		D_Operator d = new D_Operator();
//		d.method1();
//		d.method2();
		d.method3();
	}
	
	
	//IntBinaryOperator : 두 개의 int 연산
	public void method1() {
		
		IntBinaryOperator ibo = (a,b) -> a+b;
		System.out.println(ibo.applyAsInt(10, 20));
		
	}

	//IntUnaryOperator : 한 개의 int 연산
	public void method2() {
		IntUnaryOperator ino = a -> a*a;
		System.out.println(ino.applyAsInt(10)); // 100
	}
	
	//BianryOperator<T> : T와 T를 연산 후 T를 리턴
	public void method3() {
		BinaryOperator<Student> bo = (student1, student2) 
				                       -> student1.getMath() > student2.getMath() ? student1 : student2;
				                       
			Student student1 = new Student("문병철", 18, "남자", 100, 20);
			Student student2 = new Student("신수민", 14, "여자", 80, 100);
			
			System.out.println(bo.apply(student1, student2));
			
			bo = BinaryOperator.maxBy((stu1,stu2) -> Integer.compare(stu1.getMath(), stu2.getMath()));
//			  위에꺼랑 똑같음 (student1, student2)  -> student1.getMath() > student2.getMath() ? student1 : student2;
			System.out.println(bo.apply(student1, student2));
	}
}
