package com.example.hotelretrieveservice.hotel;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HotelGateway {
	
	@Autowired
	private RestTemplate template;
	
	public List<Hotel> getHotels(int page, int size) {
		Hotel[] response = template.getForObject("http://hotel-service:9096/hotels?page="+page+"&size="+size, Hotel[].class);
		return Arrays.asList(response);
	}

}
