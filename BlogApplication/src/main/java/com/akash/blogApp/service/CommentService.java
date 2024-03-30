package com.akash.blogApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.blogApp.entity.Comments;
import com.akash.blogApp.repository.CommentRepository;
import com.akash.blogApp.repository.UserRepository;

@Service
public class CommentService {
	@Autowired
	CommentRepository commentRepo;
	@Autowired
	UserRepository userRepo;
	
	public Comments addComments(Comments comments) {
		return commentRepo.save(comments);
	}

}
