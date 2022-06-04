package com.flightapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.entity.Inventory_flight;
import com.flightapp.repo.InventoryRepo;

@Service
public class InventoryService {
	
	@Autowired
	InventoryRepo inventoryRepo;

	public void addInventory(Inventory_flight inventory_flight) {
		inventoryRepo.save(inventory_flight);
	}
	public List<Inventory_flight> getAllInventories() {
		return inventoryRepo.findAll();
	}
	public void deleteInventory(Long flightId) {
		inventoryRepo.deleteById(flightId);
	}

}
