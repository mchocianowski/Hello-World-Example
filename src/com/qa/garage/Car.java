package com.qa.garage;


public class Car extends Vehicle{
	
	private String Transmission;

	public Car(String fuelType, int numOfWheels, String licenseRequired, String transmission) {
		super(fuelType, numOfWheels, licenseRequired);
		Transmission = transmission;
	}

	public String getTransmission() {
		return Transmission;
	}

	public void setTransmission(String transmission) {
		Transmission = transmission;
	}

	@Override
	public String toString() {
		return "Car [Transmission=" + Transmission + ", getFuelType()=" + getFuelType() + ", getNumOfWheels()="
				+ getNumOfWheels() + ", getLicenseRequired()=" + getLicenseRequired() + "]";
	}
	
	
}
