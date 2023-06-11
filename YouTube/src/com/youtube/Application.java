package com.youtube;

import com.youtube.controller.CommentController;
import com.youtube.model.Comment;

public class Application {

	public static void main(String[] args) {

		CommentController commentControl = new CommentController();
		
		CommentController.addComment("test1234", "1234", new Comment());
		
		
		
	}

}
