package com.qa.helloworld;

public class Runner {
	public static void main(String[] args) {
		HelloWorld myObj = new HelloWorld();

		myObj.helloWorld();
		myObj.printMessage("Hello World", "This is more text", 10);

		String myResult = myObj.concatText("Hello", "World");
		System.out.println(myResult);
	}
}
