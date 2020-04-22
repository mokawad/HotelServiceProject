package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.model.Hotel;
import com.example.repository.HotelRepository;

@Service
public class HotelService {
	
	@Autowired
	private HotelRepository repository;
	
	public Hotel create(Hotel hotel) {
		return repository.save(hotel);
	}
	
	public List<Hotel> getHotels(int page, int size) {
		PageRequest pageRequest = PageRequest.of(page, size);
		return repository.findAll(pageRequest);
	}

}
