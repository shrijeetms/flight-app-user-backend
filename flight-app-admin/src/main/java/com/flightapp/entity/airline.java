package com.flightapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class airline {
	
	
	public airline() {};
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int airlineId;
	@Column
	private String airlineName;
	@Column
	private String airlineStatus;
	
	

	public int getAirlineId() {
		return airlineId;
	}
	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getAirlineStatus() {
		return airlineStatus;
	}
	public void setAirlineStatus(String airlineStatus) {
		this.airlineStatus = airlineStatus;
	}
	@Override
	public String toString() {
		return "airline [airlineId=" + airlineId + ", airlineName=" + airlineName + ", airlineStatus=" + airlineStatus
				+ "]";
	}
	public airline(int airlineId, String airlineName, String airlineStatus) {
		super();
		this.airlineId = airlineId;
		this.airlineName = airlineName;
		this.airlineStatus = airlineStatus;
	}
}
