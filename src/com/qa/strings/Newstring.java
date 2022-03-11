package com.qa.strings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Newstring {
	String stringOne = "yesterday it was raining";
	String stringTwo = "today it is sunny";
	
	public String concatStringText() {
		return stringOne.toUpperCase() + " " + stringTwo.toUpperCase();
	}
	
	public int findWordCount() {
		String[] strOne = stringOne.split(" ");
		return strOne.length;
	}
	
	public String printOnNew() {
		return stringTwo.replace(" ", "\n");
	}
	
	public void newReverseString() {
		String[] strOne = stringOne.split(" ");
		List<String> revString = Arrays.asList(strOne);
		Collections.reverse(revString);
		for (int j = 0; j<revString.size(); j++) {
			System.out.println(revString.get(j));
		}
		}
}