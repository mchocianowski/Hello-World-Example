package com.qa.jdbc;

import java.util.List;

import com.qa.jdbc.daos.PersonDAO;
import com.qa.jdbc.domain.Person;

public class Runner {

	public static void main(String[] args) {
//		TestConnection tc = new TestConnection();
//		tc.testConnection();

		// Crud functionality ( CREATE, READ, UPDATE, DELETE)
		// Using DAO - Data Access Object
		PersonDAO pDAO = new PersonDAO();

//		Person p = new Person("Matt", "Rudge", 30);
//
//		pDAO.createPrepared(p);
//
//		// Read by ID
//		System.out.println(pDAO.readByID(1));
//
		// Read All
		List<Person> people = pDAO.readAll();

		for (Person person : people) {
			System.out.println(person);
		}
		
////		//Update
//		Person update = new Person(2, "Samuel", "Smith", 25);
//		pDAO.update(update);
//		
//		// Delete 
//		pDAO.delete(3);
	}

}