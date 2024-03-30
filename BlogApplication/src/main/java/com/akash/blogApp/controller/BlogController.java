package com.akash.blogApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akash.blogApp.entity.Blogs;
import com.akash.blogApp.repository.BlogReposiory;
import com.akash.blogApp.repository.UserRepository;

@RestController
public class BlogController {
	@Autowired
	BlogReposiory blogRepo;
	@Autowired
	UserRepository userRepo;
	@GetMapping("/getBlogs/{id}")
	public Blogs getAllBlogs(@PathVariable int id) {
		return null;
	}
	@PostMapping("/addBlogs/{uid}")
	public Blogs addBlogs(@RequestBody Blogs blogs ,@PathVariable Integer uid) {
		blogs.setUsers(userRepo.findById(uid).get());
		return blogRepo.save(blogs);
	}
	@DeleteMapping("/deleteBlogs/{bid}")
	public String deleteBlogs(@PathVariable int bid) {
		blogRepo.deleteById(bid);
		return "blog deleted";
	}
}
