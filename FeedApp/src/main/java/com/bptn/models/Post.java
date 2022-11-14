package com.bptn.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="\"Post\"")
public class Post {
	@Id
	@Column(name="\"postID\"")
	private String postID;
	@Column(name="\"postType\"")
	private String postType;
	@Column(name="\"usernameKey\"")
	private String username;
	@Column(name = "\"post\"")
    private String post;

	
	
	public Post() {
		super();
	}
	public Post(String postID, String postType, String username, String post) {
		super();
		this.postID = postID;
		this.postType = postType;
		this.username = username;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	
	public String getPostID() {
		return postID;
	}
	public void setPostID(String postID) {
		this.postID = postID;
	}
	public String getPostType() {
		return postType;
	}
	public void setPostType(String postType) {
		this.postType = postType;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	
	

}
