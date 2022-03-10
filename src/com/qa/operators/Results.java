package com.qa.operators;

public class Results {
	public int resultPhysics;
	public int resultChemistry;
	public int resultBiology;
	public int total;
	public float percentage;
	public int passMark = 60;

	public Results(int resultPhysics, int resultChemistry, int resultBiology) {
		this.resultPhysics = resultPhysics;
		this.resultChemistry = resultChemistry;
		this.resultBiology = resultBiology;
		this.total = resultPhysics + resultChemistry + resultBiology;
	}

	public void methodOne() {
		System.out.println("Physics: " + resultPhysics);
		System.out.println("Chemistry: " + resultChemistry);
		System.out.println("Biology: " + resultBiology);
		System.out.println("Total: " + total);
	}

	public void methodTwo() {

		this.percentage = (total * 100) / 450;

		if (percentage >= 60 && resultPhysics >= 90 && resultBiology >= 90 && resultChemistry >= 90) {
			System.out.println("Well done You have passed, you scored: " + percentage + "% and the pass mark was 60%");
		} else {
			System.out.println("Sorry you have failed, you scored: " + percentage + "%");

			if (resultPhysics < 90) {
				System.out.println("Sorry you have failed your Physics exam,"
						+ " therefore you have failed although your overall mark was: " + percentage + "% "
						+ "which was above the pass mark was 60%");
			}

			if (resultChemistry < 90) {
				System.out.println("Sorry you have failed your Chemistry exam,"
						+ " therefore you have failed although your overall mark was: " + percentage + "% "
						+ "which was above the pass mark was 60%");
			}

			if (resultBiology < 90) {
				System.out.println("Sorry you have failed your Biology exam,"
						+ " therefore you have failed although your overall mark was: " + percentage + "% "
						+ "which was above the pass mark was 60%");
			}
		}

	}
}
