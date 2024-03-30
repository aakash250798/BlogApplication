 package com.akash.blogApp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Comments {
	@Id
	@GeneratedValue
	private Integer id;
	private String statement;
	
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="users_id", referencedColumnName = "id")
//	@JsonBackReference
//	private Users users;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="blogs_id", referencedColumnName = "id")
	@JsonBackReference
	private Blogs blogs;
	
}
