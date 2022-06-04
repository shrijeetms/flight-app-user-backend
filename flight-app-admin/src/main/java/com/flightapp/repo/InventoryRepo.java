package com.flightapp.repo;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flightapp.entity.*;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory_flight, Long> {
	
	@Query(value="SELECT distinct a.* FROM flights a, airline b where  b.airline_status = 'Active'and (a.flight_from_place is null or a.flight_from_place = ?1)and (a.flight_to_place is null or a.flight_to_place = ?2)",nativeQuery = true)
	 List<Inventory_flight>getAllFlights(String FlightFromPlace, String FlightToPlace);
	
}
