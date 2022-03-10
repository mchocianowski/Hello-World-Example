package com.qa.operators;

public class Main {

	public static void main(String[] args) {
		Operators myObj = new Operators();
		System.out.println(myObj.operatorAddition(1, 2));
		System.out.println(myObj.operatorMultiplication(1, 2));
		System.out.println(myObj.operatorSubtraction(1, 2));
		System.out.println(myObj.operatorDivision(11, 10));

		Results examResults = new Results(10, 89, 110);
		examResults.methodOne();
		examResults.methodTwo();

	}

}
