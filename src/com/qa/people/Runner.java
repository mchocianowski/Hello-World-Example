package com.qa.people;


public class Runner {

	public static void main(String[] args) {
		
		Person a = new Person("Mateusz",24,"Software Developer");
		Person b = new Person("denzel",21,"Software Developer");
		Person c = new Person("badul",22 ,"Software Developer");
		
		
		PersonManager personmanager= new PersonManager();
		personmanager.addPerson(a);
		personmanager.addPerson(b);
		personmanager.addPerson(c);
		personmanager.printAllWithStream();
	}

}
