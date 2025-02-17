package com.lcwd.user.service.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import lombok.*;

@Entity
@Table(name= "micro_users")
public class User {

	
	@Id
	@Column(name="ID")
	private String userId;
	
	@Column(name="NAME")
	private String name;
	@Column(name="EMAIL")
	private String email;
	public User() {
		
	}
	public User(String userId, String name, String email, String about) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.about = about;
	}
	
	private User(Builder builder) {
        this.userId = builder.userId;
        this.name = builder.name;
        this.email = builder.email;
    }
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	@Column(name="ABOUT")
	private String about;
	
	@Transient
	private List<Rating> ratings = new ArrayList<>();
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
	 public static class Builder {
	        private String userId;
	        private String name;
	        private String email;
	        private String about;
	        

	        public Builder() {}

	        public Builder userId(String userId) {
	            this.userId = userId;
	            return this;
	        }

	        public Builder name(String name) {
	            this.name = name;
	            return this;
	        }

	        public Builder email(String email) {
	            this.email = email;
	            return this;
	        }
	        
	        public Builder about(String about) {
	        	this.about = about;
	        	return this;
	        }

	        public User build() {
	            return new User(this);
	        }
	    }
}
