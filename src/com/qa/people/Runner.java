package com.qa.people;


public class Runner {

	public static void main(String[] args) {
		
		Person mateusz = new Person("Mateusz", 24 ,"Software Developer");
		System.out.println("Name: " + mateusz.getName());
		System.out.println("Age: " + mateusz.getAge());
		System.out.println("Job Title: " + mateusz.getJobTitle());
		
		Person denzel = new Person("denzel", 21 ,"Software Developer");
		System.out.println("Name: " + denzel.getName());
		System.out.println("Age: " + mateusz.getAge());
		System.out.println("Job Title: " + mateusz.getJobTitle());
		
		Person badul = new Person("badul", 22 ,"Software Developer");
		System.out.println("Name: " + badul.getName());
		System.out.println("Age: " + badul.getAge());
		System.out.println("Job Title: " + badul.getJobTitle());
	}

}
