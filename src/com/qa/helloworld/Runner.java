package com.qa.helloworld;

public class Runner {
	public static void main(String[] args) {
		HelloWorld myObj = new HelloWorld();

		myObj.helloWorld();
		myObj.printMessage("Hello World", "This is more text", 10);

		String myResult = myObj.concatText("Hello", "World\n");
		System.out.println(myResult);

		World planet = new World();
		System.out.println("Planet: " + planet.planet);
		System.out.println("Countries: " + planet.countries);
		System.out.println("Continent: " + planet.continents);

		Country spain = new Country("Spain", "Madrid", 47350000);
		System.out.println("Country: " + spain.country);
		System.out.println("Capital: " + spain.capital);
		System.out.println("Population: " + spain.population);
	}
}
