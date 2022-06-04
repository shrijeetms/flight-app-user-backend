package com.flightapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.entity.Inventory_flight;
import com.flightapp.exception.FlightNotFoundException;
import com.flightapp.repo.InventoryRepo;

@Service
public class InventoryService {
	
	@Autowired
	InventoryRepo inventoryRepo;

	public void addInventory(Inventory_flight inventory_flight) {
		inventoryRepo.save(inventory_flight);
	}
	public List<Inventory_flight> getAllInventories() {
		
		if(inventoryRepo.findAll().isEmpty()) {
			throw new FlightNotFoundException();
		}
		else
			return inventoryRepo.findAll();
	}
	
	
	public void deleteInventory(Long flightId) {
		try { 
			inventoryRepo.deleteById(flightId);
		}
		catch (Exception a){
			throw new FlightNotFoundException();
		}
		
	}
	
	public List<Inventory_flight> getAllFlights(String FlightFromPlace,
			String FlightToPlace) {
		
		if(inventoryRepo.getAllFlights(FlightFromPlace, FlightToPlace).isEmpty()) {
			throw new FlightNotFoundException();
		}
		else
			return inventoryRepo.getAllFlights(FlightFromPlace, FlightToPlace);
	}

}
