package com.youtube.controller;

import java.util.ArrayList;
import java.util.List;

import com.youtube.model.Comment;

// 개인과제는 이 방식대로 
public class CommentController {

	
	List<Comment> comments = new ArrayList<>();
	UserController uc = new UserController();
	
	
	// C : 댓글 작성 -- > 로그인된 회원만 가능
	public void addComment(String id, String password,Comment comment) {
		if(uc.login(id, password)) {
			comments.add(comment);
		}
	}
	
	// R : 댓글 1개 보기
	public Comment viewComment(int index) {
		return comments.get(0);
	}
	
	
	// U : 댓글 수정 -- > 로근인한 회원과 이 댓글을 작성한 작성자가 일치해야함
	public void updateComment(int index, Comment comment) {
		comments.set(index, comment);
	}
	
	// D : 댓글 삭제 --> 로근인한 회원과 이 댓글을 작성한 작성자가 일치해야함
	public void deleteComment(int index) {
		comments.remove(index);
	}
}
