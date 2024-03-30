package com.akash.blogApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.blogApp.entity.Users;
import com.akash.blogApp.repository.UserRepository;
import com.akash.blogApp.service.UserService;

@RestController

public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	UserRepository userRepo;
	@GetMapping("/getUsers")
	public List<Users> getAll(){
		return userRepo.findAll();
	}
	@PostMapping("/addUsers")
	public Users addUsers(@RequestBody Users users) {
		return userRepo.save(users);
	}
	
	

}
