package com.flightapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Table(name = "flights")
public class Inventory_flight {

	public Inventory_flight() {
	};

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long flightId;

	@Column
	private String FlightAirline;
	@Column
	private String FlightFromPlace;
	@Column
	private String FlightToPlace;
	@Column
	private Date FlightStartDate;
	@Column
	private Date FlightEndDate;
	@Column
	private String FlightScheduledDays;
	@Column
	private String FlightInstrumentUsed;
	@Column
	private int FlightBussinessSeats;
	@Column
	private int FlightNonBusinessSeats;
	@Column
	private double FlightPrice;
	@Column
	private int FlightRows;
	@Column
	private String FlightMeal;

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public String getFlightAirline() {
		return FlightAirline;
	}

	public void setFlightAirline(String flightAirline) {
		FlightAirline = flightAirline;
	}

	public String getFlightFromPlace() {
		return FlightFromPlace;
	}

	public void setFlightFromPlace(String flightFromPlace) {
		FlightFromPlace = flightFromPlace;
	}

	public String getFlightToPlace() {
		return FlightToPlace;
	}

	public void setFlightToPlace(String flightToPlace) {
		FlightToPlace = flightToPlace;
	}

	public Date getFlightStartDate() {
		return FlightStartDate;
	}

	public void setFlightStartDate(Date flightStartDate) {
		FlightStartDate = flightStartDate;
	}

	public Date getFlightEndDate() {
		return FlightEndDate;
	}

	public void setFlightEndDate(Date flightEndDate) {
		FlightEndDate = flightEndDate;
	}

	public String getFlightScheduledDays() {
		return FlightScheduledDays;
	}

	public void setFlightScheduledDays(String flightScheduledDays) {
		FlightScheduledDays = flightScheduledDays;
	}

	public String getFlightInstrumentUsed() {
		return FlightInstrumentUsed;
	}

	public void setFlightInstrumentUsed(String flightInstrumentUsed) {
		FlightInstrumentUsed = flightInstrumentUsed;
	}

	public int getFlightBussinessSeats() {
		return FlightBussinessSeats;
	}

	public void setFlightBussinessSeats(int flightBussinessSeats) {
		FlightBussinessSeats = flightBussinessSeats;
	}

	public int getFlightNonBusinessSeats() {
		return FlightNonBusinessSeats;
	}

	public void setFlightNonBusinessSeats(int flightNonBusinessSeats) {
		FlightNonBusinessSeats = flightNonBusinessSeats;
	}

	public double getFlightprice() {
		return FlightPrice;
	}

	public void setFlightprice(double flightprice) {
		FlightPrice = flightprice;
	}

	public int getFlightRows() {
		return FlightRows;
	}

	public void setFlightRows(int flightRows) {
		FlightRows = flightRows;
	}

	public String getFlightMeal() {
		return FlightMeal;
	}

	public void setFlightMeal(String flightMeal) {
		FlightMeal = flightMeal;
	}

	public Inventory_flight(Long flightId, String flightAirline, String flightFromPlace, String flightToPlace,
			Date flightStartDate, Date flightEndDate, String flightScheduledDays, String flightInstrumentUsed,
			int flightBussinessSeats, int flightNonBusinessSeats, double flightPrice, int flightRows,
			String flightMeal) {
		super();
		this.flightId = flightId;
		FlightAirline = flightAirline;
		FlightFromPlace = flightFromPlace;
		FlightToPlace = flightToPlace;
		FlightStartDate = flightStartDate;
		FlightEndDate = flightEndDate;
		FlightScheduledDays = flightScheduledDays;
		FlightInstrumentUsed = flightInstrumentUsed;
		FlightBussinessSeats = flightBussinessSeats;
		FlightNonBusinessSeats = flightNonBusinessSeats;
		FlightPrice = flightPrice;
		FlightRows = flightRows;
		FlightMeal = flightMeal;
	}

	@Override
	public String toString() {
		return "Inventory_flight [flightId=" + flightId + ", FlightAirline=" + FlightAirline + ", FlightFromPlace="
				+ FlightFromPlace + ", FlightToPlace=" + FlightToPlace + ", FlightStartDate=" + FlightStartDate
				+ ", FlightEndDate=" + FlightEndDate + ", FlightScheduledDays=" + FlightScheduledDays
				+ ", FlightInstrumentUsed=" + FlightInstrumentUsed + ", FlightBussinessSeats=" + FlightBussinessSeats
				+ ", FlightNonBusinessSeats=" + FlightNonBusinessSeats + ", Flightprice=" + FlightPrice
				+ ", FlightRows=" + FlightRows + ", FlightMeal=" + FlightMeal + "]";
	}

}
