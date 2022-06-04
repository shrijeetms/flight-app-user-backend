
package com.flightapp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.entity.airline;
import com.flightapp.exception.AirlineNotFoundException;
import com.flightapp.exception.FlightNotFoundException;
import com.flightapp.repo.adminRepo;

@Service
public class airlineService {

	@Autowired
	adminRepo adminrepo;

	public List<airline> getAllAirlines() {
		if(adminrepo.findAll().isEmpty()) {
			throw new AirlineNotFoundException();
		}
		else
			return adminrepo.findAll();
		
		
	}

	public void addAirline(airline airline) {
		try {
		adminrepo.save(airline);}
		catch (Exception e) {throw new AirlineNotFoundException();}
	}
	

	public void blockedAirline(int airlineId, airline airline) {
		
		airline.setAirlineStatus("Inactive");
		airline.setAirlineId(airlineId);
		try {
		adminrepo.save(airline);
		}
		catch (Exception e) {throw new AirlineNotFoundException();}
	}

}
