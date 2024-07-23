package com.lcwd.hotel.services;

import java.util.List;

import com.lcwd.hotel.entities.Hotel;

public interface HotelService {
	
	//create
	Hotel create(Hotel hotel);
	
	//getall
	List<Hotel> getAll();
	
	
	//getsingle
	Hotel get(String id);

}
