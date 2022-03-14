package com.qa.garage;

public class Main {

	public static void main(String[] args) {
		Garage listOfVehicles = new Garage();
		Car carOne = new Car("Diesel",4,"B License","Automatic");
		listOfVehicles.addToGarage(carOne);
		
		listOfVehicles.printAll();
		

	}
}