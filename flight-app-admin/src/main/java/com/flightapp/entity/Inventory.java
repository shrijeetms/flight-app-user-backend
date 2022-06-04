package com.flightapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Table(name ="Inventories")
public class Inventory {
	
	public Inventory() {};
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightId;
	@Column
	private String airline;
	@Column
	private String fromPlace;
	@Column
	private String toPlace;
	@Column
	private Date startDate;
	@Column
	private Date endDate;
	@Column
	private int scheduledDays;
	@Column
	private String instrumentUsed;
	@Column
	private int bussinessSeats;
	@Column
	private int nonBusinessSeats;
	@Column
	private double price;
	@Column
	private int rows;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getScheduledDays() {
		return scheduledDays;
	}
	public void setScheduledDays(int scheduledDays) {
		this.scheduledDays = scheduledDays;
	}
	public String getInstrumentUsed() {
		return instrumentUsed;
	}
	public void setInstrumentUsed(String instrumentUsed) {
		this.instrumentUsed = instrumentUsed;
	}
	public int getBussinessSeats() {
		return bussinessSeats;
	}
	public void setBussinessSeats(int bussinessSeats) {
		this.bussinessSeats = bussinessSeats;
	}
	public int getNonBusinessSeats() {
		return nonBusinessSeats;
	}
	public void setNonBusinessSeats(int nonBusinessSeats) {
		this.nonBusinessSeats = nonBusinessSeats;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
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
				+ ", instrumentUsed=" + instrumentUsed + ", bussinessSeats=" + bussinessSeats + ", nonBusinessSeats="
				+ nonBusinessSeats + ", price=" + price + ", rows=" + rows + ", meal=" + meal + "]";
	}
	public Inventory(int flightId, String airline, String fromPlace, String toPlace, Date startDate, Date endDate,
			int scheduledDays, String instrumentUsed, int bussinessSeats, int nonBusinessSeats, double price, int rows,
			String meal) {
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
		this.nonBusinessSeats = nonBusinessSeats;
		this.price = price;
		this.rows = rows;
		this.meal = meal;
	}
	
	

}
