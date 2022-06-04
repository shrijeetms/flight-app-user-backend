package com.flightapp.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flightapp.entity.Inventory_flight;
import com.flightapp.service.InventoryService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/admin")
public class inventoryController {
	
	@Autowired
	InventoryService inventoryService;
	
	@PostMapping("/airline/inventory/add")
	public ResponseEntity<Object> addInventory(@RequestBody Inventory_flight inventory_flight) {
		inventoryService.addInventory(inventory_flight);
		return new ResponseEntity<>("Inventory_flight Added", HttpStatus.CREATED);	
	}
	
	@GetMapping("/airline/inventory/getInventory")
	public List<Inventory_flight> getAllInventories() {
		System.out.print("test");
		return inventoryService.getAllInventories();
	}
	
	@DeleteMapping("/airline/inventory/delete/{flightId}")
	public ResponseEntity<Object> deleteInventories(@PathVariable Long flightId) {
		inventoryService.deleteInventory(flightId);
		return new ResponseEntity<>("Inventory_flight Deleted", HttpStatus.OK);
	}
	
	@GetMapping("/airline/inventory/getAllFlights/{FlightFromPlace}/{FlightToPlace}")
	public List<Inventory_flight> getAllFlights(@PathVariable String FlightFromPlace,
			@PathVariable String FlightToPlace) {
		return inventoryService.getAllFlights(FlightFromPlace, FlightToPlace);
	}
	
	

}
