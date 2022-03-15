package com.qa.people;

import java.awt.Choice;
import java.util.Scanner;

public class PersonMenu {
	public void start() {
	PersonManager personmanager= new PersonManager();
	personManager person= new PersonManager();
	Scanner scanner = new Scanner(System.in);
	
    System.out.println("Enter your name");
    String name = scanner.nextLine();
    
    System.out.println("Enter your age");
    int age = scanner.nextInt();
    
    scanner.nextLine();
    
    System.out.println("Enter your job title");
    String jobTitle = scanner.nextLine();
    
    String choice = scanner.nextLine();
    System.out.println("Would you like to save your details?");
    if (choice.equalsIgnoreCase("y")) {
    	System.out.println(personmanager.addPerson(name, age, jobTitle));
    }
    }
}
