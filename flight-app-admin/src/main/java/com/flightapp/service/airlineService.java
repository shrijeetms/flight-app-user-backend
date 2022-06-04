package com.flightapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.entity.Inventory;
import com.flightapp.entity.airline;
import com.flightapp.repo.adminRepo;

@Service
public class airlineService {

	@Autowired
	adminRepo adminrepo;
	
	public List<airline> getAllAirlines() {
		return adminrepo.findAllAirline();
	}
	
	public void addAirline(airline airline) {
		adminrepo.save(airline);
	}
	
	public void blockedAirline(int airlineId ,airline airline) {
		airline.setAirlineStatus("Inactive");
		airline.setAirlineId(airlineId);
		adminrepo.save(airline);
	}


}
