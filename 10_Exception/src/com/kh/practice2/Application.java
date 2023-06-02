package com.kh.practice2;

import com.kh.practice2.exception.RecordNotFoundException;

public class Application {

	public static void main(String[] args) {

		try {
			throw new DuplicateNameException();

			
		}catch(DuplicateNameException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			throw new RecordNotFoundException();
		}catch(RecordNotFoundException e) { // Exception e로만 적어도 가능 
			System.out.println(e.getMessage());
		}
		
	}

}
