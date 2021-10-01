package com.example.flightBooking;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
	List<Flight> findFlight(City Source, City Destination ,Date takeOffTime, Date landingTime);
}
