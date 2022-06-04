
package com.flightapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.flightapp.entity.airline;

@Controller

@RequestMapping("/admin")
public class airlineController {

	@Autowired
	com.flightapp.service.airlineService airlineService;

	@GetMapping("/airline/getAllAirlines")
	public java.util.List<airline> getAllAirlines() {
		return airlineService.getAllAirlines();
	}

	@PostMapping("/airline/register")
	public ResponseEntity<Object> addAirline(@RequestBody airline airline) {
		airlineService.addAirline(airline);
		return new ResponseEntity<>("Airline Added", HttpStatus.CREATED);
	}

	@PutMapping("/airline/block/{airlineId}")
	public ResponseEntity<Object> blockedAirline(@PathVariable int airlineId, @RequestBody airline airline) {
		airlineService.blockedAirline(airlineId, airline);
		return new ResponseEntity<>("Airline Blocked", HttpStatus.OK);
	}

}
