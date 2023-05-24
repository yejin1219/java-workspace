package com.kh.example.practice2;

import com.kh.example.practice2.model.Circle;

public class Run {

	public static void main(String[] args) {

		
		Circle c = new Circle();
		c.incrementRadius();
		
		//원의 둘레 = 2*반지름*PI
		System.out.println(2*c.radius*Circle.PI);
		//원의 넓이 = 반지름*반지름*PI
		System.out.println(c.radius*c.radius*Circle.PI);
		
	}

}
