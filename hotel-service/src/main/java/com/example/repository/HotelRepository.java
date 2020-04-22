package com.example.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Hotel;

@Repository
public interface HotelRepository extends CrudRepository<Hotel, Long> {
	public List<Hotel> findAll(Pageable pageable);
}
