package com.qa.Arrays;

public class Array {

	public int[] numArray = { 2, 3, 5, 25, 19, 20, 22, 100, 90, 1000 };

	public void arrayLoop(int[] numArray) {
		this.numArray = numArray;
		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
	}
}
