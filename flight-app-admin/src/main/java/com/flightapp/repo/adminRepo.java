package com.flightapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.entity.airline;

@Repository
public interface adminRepo extends JpaRepository<airline, Long> {

}
