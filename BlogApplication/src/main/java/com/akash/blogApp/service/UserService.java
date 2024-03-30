package com.akash.blogApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.blogApp.entity.Users;
import com.akash.blogApp.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;
	public List<Users> getAllUsers() {
		return userRepo.findAll();
	}
	public Users getById(int id) {
		return userRepo.findById(id).get();
	}
	public Users createUser(Users user) {
		return userRepo.save(user);
	}
	public String deleteById(int id) {
		 userRepo.delete(userRepo.findById(id).get());
		 return "User deleted";
	}
	
	
}
