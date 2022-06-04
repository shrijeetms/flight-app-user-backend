package com.flightapp.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.entity.*;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory_flight, Long> {

}
