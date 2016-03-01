package com.blog6.domain;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class PostBlog {

	
	@Id
	@GeneratedValue
	private Long id;
	private String blog;
	private String username;
	
	@OneToMany(mappedBy = "postblog")
	private Set<CommentBlog> commentblog = new HashSet<CommentBlog>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<CommentBlog> getCommentblog() {
		return commentblog;
	}

	public void setCommentblog(Set<CommentBlog> commentblog) {
		this.commentblog = commentblog;
	}

	

}
