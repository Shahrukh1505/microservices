package com.lcwd.hotel.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.repositories.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;
	@Override
	public Hotel create(Hotel hotel) {
		// TODO Auto-generated method stub
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	@Override
	public Hotel get(String id) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel with given id not found !!"));
	}

	
}
