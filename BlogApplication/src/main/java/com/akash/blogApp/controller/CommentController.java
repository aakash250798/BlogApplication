package com.akash.blogApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akash.blogApp.entity.Blogs;
import com.akash.blogApp.entity.Comments;
import com.akash.blogApp.repository.BlogReposiory;
import com.akash.blogApp.repository.CommentRepository;
import com.akash.blogApp.repository.UserRepository;

@RestController
public class CommentController {
	
	@Autowired
	CommentRepository commentRepo;
	@Autowired
	UserRepository userRepo;
	@Autowired
	BlogReposiory blogRepo;
	
	@PostMapping("/addComments/{bid}")
	public Comments addComment(@RequestBody Comments comments ,@PathVariable Integer bid) {
		//comments.setUsers(userRepo.findById(uid).get());
		comments.setBlogs(blogRepo.findById(bid).get());
		return commentRepo.save(comments);
	}
	
	@GetMapping("/getComments/{bid}")
	public List<Comments> getComments(@PathVariable int bid){
		Blogs blog=blogRepo.findById(bid).get();
		return blog.getComments();	
	}
	
	@DeleteMapping("/deleteComments/{cid}")
	public String deleteComments(@PathVariable int cid) {
		commentRepo.deleteById(cid);
		return "deleted";
	}
	
	
}
