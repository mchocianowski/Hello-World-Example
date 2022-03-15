package com.qa.people;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {

	List<Person> listOfPeople = new ArrayList<>();
	
	public void addPerson(Person person) {
		this.listOfPeople.add(person);
	}
	
	public List<Person> getPeople() {
		return listOfPeople; 
	}

	public void printAllWithStream() {
		System.out.println("Full list of entries");
		System.out.println("-----------------------------");
		listOfPeople.stream().forEach(person -> {
			System.out.println(person);
			System.out.println("-----------------------------");
		});
	}
	public void search(String name) {
		for (Person person : this.listOfPeople) {
			if (person.getName().equals(name)) {
				System.out.println("Person Found!");
				System.out.println(person);
			}
		}
	}
}
