package com.flyersInc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.metrics.jfr.FlightRecorderApplicationStartup;
import org.springframework.stereotype.Service;

import com.flyersInc.models.Flight;
import com.flyersInc.repos.FlightRepository;

@Service
public class FlightService {

	@Autowired
	FlightRepository flightRepository;
	
	public void addFlight(Flight flight) {
		flightRepository.save(flight);
		System.out.println(flight);
	}

}
