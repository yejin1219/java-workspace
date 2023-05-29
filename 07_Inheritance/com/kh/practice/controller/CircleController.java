package com.kh.practice.controller;

import com.kh.practice.model.Circle;

public class CircleController {

	
	private Circle c = new Circle();
	
	public  String calcArea(int x, int y, int radius ) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
	 
		return c.draw() + " / " + Math.PI * radius * radius;
	}
	

	public String calcCircum(int x, int y,int radius) {
		this.calcArea(x, y, radius);
		return c.draw() + " / " + Math.PI * radius * 2;
	}
}
