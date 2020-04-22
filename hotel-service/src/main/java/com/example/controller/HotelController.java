package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Hotel;
import com.example.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	private HotelService service;
	
	@PostMapping
	private ResponseEntity<Hotel> create(@RequestBody Hotel hotel) {
		return new ResponseEntity<>(service.create(hotel), HttpStatus.CREATED);
	}
	
	
	@GetMapping
	private ResponseEntity<List<Hotel>> getHotels(@RequestParam("page") int page, @RequestParam("size") int size) {
		return new ResponseEntity<>(service.getHotels(page, size), HttpStatus.OK);
	}

}
