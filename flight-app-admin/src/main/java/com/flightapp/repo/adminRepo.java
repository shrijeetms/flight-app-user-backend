package com.flightapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import com.flightapp.entity.airline;

@Repository
public interface adminRepo extends JpaRepository<airline, Long> {
	
	
	@Query(value="SELECT * from airline", nativeQuery=true)
	List<airline> findAllAirline();

}
