package com.example.hotelretrieveservice.hotel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
	
	@Autowired
	private HotelGateway gateway;
	
	public List<Hotel> getHotels(int page, int size) {
		return gateway.getHotels(page, size);
	}

}
