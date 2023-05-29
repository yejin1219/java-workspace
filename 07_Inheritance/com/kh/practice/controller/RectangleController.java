package com.kh.practice.controller;

import com.kh.practice.model.Rectangle;

public class RectangleController {

	Rectangle r = new Rectangle();
	

	
	public String calcArea(int x, int y, int heigt,int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(heigt);
		r.setWidth(width);
		
		
		return r.draw() + " / " +heigt*width;
		
	}
	
	public String calcPerimeter(int x, int y, int heigt,int width) {
		this.calcArea(x, y, heigt, width);
		
		return r.draw() + " / " + 2*(heigt + width) ;
	}
}
