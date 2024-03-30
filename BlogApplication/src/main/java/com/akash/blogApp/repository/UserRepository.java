package com.akash.blogApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akash.blogApp.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {

}
