package com.qa.garage;

public class HGV extends Vehicle{
	
	private int loadCapacity;
	
	public HGV(String fuelType, int numOfWheels, String licenseRequired, int id, int loadCapacity) {
		super(fuelType, numOfWheels, licenseRequired, id);
		this.loadCapacity = loadCapacity;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	@Override
	public String toString() {
		return "HGV [loadCapacity=" + loadCapacity + ", getFuelType()=" + getFuelType() + ", getNumOfWheels()="
				+ getNumOfWheels() + ", getLicenseRequired()=" + getLicenseRequired() + "]";
	}

}
