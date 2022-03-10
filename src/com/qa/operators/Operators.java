package com.qa.operators;

public class Operators {

	public int operatorAddition(int numOne, int numTwo) {
		return numOne + numTwo;
	}

	public int operatorMultiplication(int numOne, int numTwo) {
		return numOne * numTwo;
	}

	public int operatorSubtraction(int numOne, int numTwo) {
		return numOne - numTwo;
	}

	public double operatorDivision(int numOne, int numTwo) {
		double x = numOne;
		double y = numTwo;
		if (numOne < numTwo) {
			return x / y;
		} else {
			System.out.println("The Division Cannot be performed");
			return 0;
		}
//(float) is called casting and is used to change this particular 
//input from an int to a float. This is used to solve rounding errors
	}
}
