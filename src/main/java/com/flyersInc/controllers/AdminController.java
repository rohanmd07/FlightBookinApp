package com.flyersInc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flyersInc.models.Flight;
import com.flyersInc.services.FlightService;

@RestController
@RequestMapping("/api/v1.0/flight")
public class AdminController {
	
	@Autowired 
	FlightService flightService;
	@GetMapping
	public String callGet() {
		return "get called";
	}
	
	@PostMapping("/airline/inventory/add")
	public void addNewFlightService(@RequestBody Flight flight) {
		flightService.addFlight(flight);
	}
	

}
