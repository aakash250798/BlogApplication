package com.akash.blogApp.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Blogs {
	@Id
	@GeneratedValue
	int id;
	String story;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="users_id", referencedColumnName = "id")
	@JsonBackReference
	private Users users;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="blogs")
	@JsonManagedReference
	List<Comments>comments;
}
