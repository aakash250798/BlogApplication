package com.akash.blogApp.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Users {
	
	@Id
	@GeneratedValue
	Integer id;
	String name;
	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy="users")
//	@JsonManagedReference
//	List<Comments> comments;
	
//	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy="users")
	@JsonManagedReference
	List<Blogs>blogs;

}
