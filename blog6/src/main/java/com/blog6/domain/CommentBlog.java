package com.blog6.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CommentBlog {
	
	
	   @ManyToOne
	    private PostBlog postblog;

	    @Id
	    @GeneratedValue
	    private Long id;
	    private String uri;
	    private String description;

	    CommentBlog() { // jpa only
	    }

	    public CommentBlog(PostBlog postblog, String uri, String description) {
	        this.uri = uri;
	        this.description = description;
	        this.postblog = postblog;
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUri() {
			return uri;
		}

		public void setUri(String uri) {
			this.uri = uri;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

	    
	 

}
