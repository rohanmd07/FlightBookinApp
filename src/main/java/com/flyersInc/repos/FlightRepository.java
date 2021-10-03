package com.flyersInc.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyersInc.models.Flight;


public interface FlightRepository extends JpaRepository<Flight, Integer>{
	
}