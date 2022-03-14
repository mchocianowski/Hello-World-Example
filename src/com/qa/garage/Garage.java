package com.qa.garage;

import java.util.List;
import java.util.ArrayList;

public class Garage {
		List<Vehicle> listOfVehicles = new ArrayList <>();
		public void addToGarage( Vehicle vehicle) {
		this.listOfVehicles.add(vehicle);
		}
		public void printAll() {
			for (Vehicle vehicle : this.listOfVehicles) {
				System.out.println(vehicle);
			}
		}
}
