package com.kh.practice2;

public class DuplicateNameException extends Exception{
	
	public DuplicateNameException() {
		
		this("This is DuplicateNameException...");
	}
	
	public DuplicateNameException(String message) {
		super(message);
	}

	
}
