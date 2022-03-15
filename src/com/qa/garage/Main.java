package com.qa.garage;

public class Main {

	public static void main(String[] args) {
		Garage listOfVehicles = new Garage();
		Garage Bill = new Garage();
		Car carOne = new Car("Diesel",4,"B License",1,"Automatic");
		listOfVehicles.addToGarage(carOne);
		listOfVehicles.printList();
		Bill.getBill(carOne);

	}
}