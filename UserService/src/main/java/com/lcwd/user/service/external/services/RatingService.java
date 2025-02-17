package com.lcwd.user.service.external.services;

import java.util.Map;
import java.util.Objects;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.lcwd.user.service.entities.Rating;


@Service
@FeignClient(name="RATING-SERVICE")
public interface RatingService {
	
	//get
	
	
	
	//POST
	
	@PostMapping("/ratings")
	public Rating createRating(Rating values);
	
	//PUT
	
	@PutMapping("ratings/{ratingId}")
	public Rating updateRating(@PathVariable("ratingId") String ratingId, Rating values);
	
	
	@DeleteMapping("ratings/{ratingId}")
	public void deleteRating(@PathVariable String ratingId);
}
