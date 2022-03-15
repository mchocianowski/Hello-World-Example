package com.qa.garage;

public class Motorbike extends Vehicle {
	
	private String engineCapacity;
	
	

	public Motorbike(String fuelType, int numOfWheels, String licenseRequired, int id, String engineCapacity) {
		super(fuelType, numOfWheels, licenseRequired, id);
		this.engineCapacity = engineCapacity;
	}

	public String getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(String engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "Motorbike [engineCapacity=" + engineCapacity + ", getFuelType()=" + getFuelType()
				+ ", getNumOfWheels()=" + getNumOfWheels() + ", getLicenseRequired()=" + getLicenseRequired() + "]";
	}


}
