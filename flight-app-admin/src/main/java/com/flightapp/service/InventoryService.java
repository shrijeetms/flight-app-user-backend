package com.flightapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.entity.Inventory;
import com.flightapp.entity.airline;
import com.flightapp.repo.InventoryRepo;

@Service
public class InventoryService {
	
	@Autowired
	InventoryRepo inventoryRepo;

	public void addInventory(Inventory inventory) {
		inventoryRepo.save(inventory);
	}
	public List<Inventory> getAllInventories() {
		return inventoryRepo.findAll();
	}
	
	public void deleteInventory(Integer flightId) {
		inventoryRepo.deleteById(flightId);
	}

}
