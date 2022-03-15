package com.qa.operators;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Operators myObj = new Operators();
		
		Scanner scan = new Scanner(System.in);
		
        System.out.println("Enter a number");
        int numOne = scan.nextInt();
        
        System.out.println("Enter a number");
        int numTwo = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Which mathematical method would you like to perfom? Addition,Muliplication, Subraction or Division?");
        
        String choice = scan.nextLine();
        if (choice.equalsIgnoreCase("Addition")) {
        	System.out.println(myObj.operatorAddition(numOne, numTwo));
        } else if (choice.equalsIgnoreCase("Multiplication")) {
        	System.out.println(myObj.operatorMultiplication(numOne, numTwo));
        } else if (choice.equalsIgnoreCase("Subtraction")) {
			System.out.println(myObj.operatorSubtraction(numOne, numTwo));
        } else if (choice.equalsIgnoreCase("Division")) {
        	System.out.println(myObj.operatorDivision(numOne, numTwo));
        }

//		Results examResults = new Results(10, 89, 110);
//		examResults.methodOne();
//		examResults.methodTwo();

	}

}
