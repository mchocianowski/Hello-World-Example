package com.qa.strings;

public class Main {

	public static void main(String[] args) {
		Newstring myString = new Newstring();
		
		String myFirstString = myString.concatStringText();
		System.out.println(myFirstString);
		
		int stringCount = myString.findWordCount();
		System.out.println(stringCount);
		
		String newLine = myString.printOnNew();
		System.out.println(newLine);
		
		myString.newReverseString();
	}

}
