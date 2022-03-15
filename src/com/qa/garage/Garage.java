package com.qa.garage;

import java.util.List;
import java.util.ArrayList;

public class Garage {
	List<Vehicle> listOfVehicles = new ArrayList<>();

	public void addToGarage(Vehicle vehicle) {
		this.listOfVehicles.add(vehicle);
	}

	public void printList() {
		for (Vehicle vehicle : this.listOfVehicles) {
			System.out.println(vehicle);
		}
	}

	public void getBill(Vehicle vehicle) {
		double bill = 0.2;
		if(vehicle instanceof Car) {
			bill*= 500;
		} else if(vehicle instanceof Motorbike) {
			bill*= 250;
		} else if(vehicle instanceof HGV) {
			bill*= 500;
		}
		System.out.println(bill);
	}
}
