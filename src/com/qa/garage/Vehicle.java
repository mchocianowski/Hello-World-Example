package com.qa.garage;

public class Vehicle {
	private String fuelType;
	private int numOfWheels;
	private String licenseRequired;
	
	public Vehicle(String fuelType, int numOfWheels, String licenseRequired) {
		this.fuelType = fuelType;
		this.numOfWheels = numOfWheels;
		this.licenseRequired = licenseRequired;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getLicenseRequired() {
		return licenseRequired;
	}

	public void setLicenseRequired(String licenseRequired) {
		this.licenseRequired = licenseRequired;
	}

	@Override
	public String toString() {
		return "Vehicle [fuelType=" + fuelType + ", numOfWheels=" + numOfWheels + ", licenseRequired=" + licenseRequired
				+ "]";
	}
	
	
	
}
