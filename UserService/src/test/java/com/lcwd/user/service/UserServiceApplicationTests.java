package com.lcwd.user.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lcwd.user.service.entities.Rating;
import com.lcwd.user.service.external.services.RatingService;

@SpringBootTest
class UserServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private RatingService ratingService;

	
	@Test
	void createRating() {
		Rating rating = new Rating.Builder().rating(10).userId("").hotelId("").feedback("This is created using fiegn client").build();
		Rating savedRating = ratingService.createRating(rating);
		System.out.println("new rating created");
	}
}
