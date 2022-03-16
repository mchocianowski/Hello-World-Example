package com.qa.jdbc;

import com.qa.jdbc.daos.PersonDAO;
import com.qa.jdbc.domain.Person;

public class Runner {

	public static void main(String[] args) {
//		TestConnection tc = new TestConnection();
//		tc.testConnection();
		
		//	Crud functionality ( CREATE, READ, UPDATE, DELETE)
		//	Using DAO - Data Access Object
		PersonDAO pDAO = new PersonDAO();
		
		Person p = new Person("Matt", "Rudge", 30);
		
		pDAO.createPrepared(p);
	}

}
