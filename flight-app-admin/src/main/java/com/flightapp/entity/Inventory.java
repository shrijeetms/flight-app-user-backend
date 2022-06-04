package com.flightapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventory {
	
	public Inventory() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightId;
	@Column
	private String airline;
	@Column
	private String fromPlace;
	@Column
	private String toPlace;
	@Column
	private String startDate;
	@Column
	private String endDate;
	@Column
	private String scheduledDays;
	@Column
	private String instrumentUsed;
	@Column
	private String bussinessSeats;
	@Column
	private String non_businessSeats;
	@Column
	private String price;
	@Column
	private String rows;
	@Column
	private String meal;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getScheduledDays() {
		return scheduledDays;
	}
	public void setScheduledDays(String scheduledDays) {
		this.scheduledDays = scheduledDays;
	}
	public String getInstrumentUsed() {
		return instrumentUsed;
	}
	public void setInstrumentUsed(String instrumentUsed) {
		this.instrumentUsed = instrumentUsed;
	}
	public String getBussinessSeats() {
		return bussinessSeats;
	}
	public void setBussinessSeats(String bussinessSeats) {
		this.bussinessSeats = bussinessSeats;
	}
	public String getNon_businessSeats() {
		return non_businessSeats;
	}
	public void setNon_businessSeats(String non_businessSeats) {
		this.non_businessSeats = non_businessSeats;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getRows() {
		return rows;
	}
	public void setRows(String rows) {
		this.rows = rows;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	@Override
	public String toString() {
		return "Inventory [flightId=" + flightId + ", airline=" + airline + ", fromPlace=" + fromPlace + ", toPlace="
				+ toPlace + ", startDate=" + startDate + ", endDate=" + endDate + ", scheduledDays=" + scheduledDays
				+ ", instrumentUsed=" + instrumentUsed + ", bussinessSeats=" + bussinessSeats + ", non_businessSeats="
				+ non_businessSeats + ", price=" + price + ", rows=" + rows + ", meal=" + meal + "]";
	}
	public Inventory(int flightId, String airline, String fromPlace, String toPlace, String startDate, String endDate,
			String scheduledDays, String instrumentUsed, String bussinessSeats, String non_businessSeats, String price,
			String rows, String meal) {
		super();
		this.flightId = flightId;
		this.airline = airline;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.startDate = startDate;
		this.endDate = endDate;
		this.scheduledDays = scheduledDays;
		this.instrumentUsed = instrumentUsed;
		this.bussinessSeats = bussinessSeats;
		this.non_businessSeats = non_businessSeats;
		this.price = price;
		this.rows = rows;
		this.meal = meal;
	}
	

}
