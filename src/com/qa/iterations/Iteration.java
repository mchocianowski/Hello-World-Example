package com.qa.iterations;

public class Iteration {

	public double cost;
	public double payment;
	public double changeGiven;

	public int fiveNote = 0;
	public int tenNote = 0;
	public int twentyNote = 0;
	public int poundCoin = 0;
	public int twopoundCoin = 0;
	public int onepenceCoin = 0;
	public int twopenceCoin = 0;
	public int fivepenceCoin = 0;
	public int tenpenceCoin = 0;
	public int twentypenceCoin = 0;
	public int fiftypenceCoin = 0;

	public void calculation(double cost, double payment) {
		this.cost = cost;
		this.payment = payment;
		this.changeGiven = (payment - cost);

		while (changeGiven >= 20) {
			changeGiven -= 20;
			twentyNote++;
		}
		while (changeGiven >= 10) {
			changeGiven -= 10;
			tenNote++;
		}
		while (changeGiven >= 5) {
			changeGiven -= 5;
			fiveNote++;
		}
		while (changeGiven >= 1) {
			changeGiven -= 1;
			poundCoin++;
		}
		while (changeGiven >= 1) {
			changeGiven -= 1;
			twopoundCoin++;
		}
		while (changeGiven >= 0.50) {
			changeGiven -= 0.50;
			fiftypenceCoin++;
		}
		while (changeGiven >= 0.20) {
			changeGiven -= 0.20;
			twentypenceCoin++;
		}
		while (changeGiven >= 0.10) {
			changeGiven -= 0.10;
			tenpenceCoin++;
		}
		while (changeGiven >= 0.05) {
			changeGiven -= 0.05;
			fivepenceCoin++;
		}
		while (changeGiven >= 0.019) {
			changeGiven -= 0.02;
			twopenceCoin++;
		}
		while (changeGiven >= 0.009) {
			changeGiven -= 0.01;
			onepenceCoin++;
		}
		System.out.println("");
		if (twentyNote > 0) {
			System.out.println(twentyNote + " Twenty pound note(s)");
		}
		if (tenNote > 0) {
			System.out.println(tenNote + " Ten pound note(s)");
		}
		if (fiveNote > 0) {
			System.out.println(fiveNote + " Five pound note(s)");
		}
		if (twopoundCoin > 0) {
			System.out.println(twopoundCoin + " Two pound coin(s)");
		}

		if (poundCoin > 0) {
			System.out.println(poundCoin + " One pound coin(s)");
		}
		if (fiftypenceCoin > 0) {
			System.out.println(fiftypenceCoin + " Fifty pence coin(s)");
		}
		if (twentypenceCoin > 0) {
			System.out.println(twentypenceCoin + " Twenty pence coin(s)");
		}
		if (tenpenceCoin > 0) {
			System.out.println(tenpenceCoin + " Ten pence coin(s)");
		}
		if (fivepenceCoin > 0) {
			System.out.println(fivepenceCoin + " Five pence coin(s)");
		}
		if (twopenceCoin > 0) {
			System.out.println(twopenceCoin + " Two pence coin(s)");
		}
		if (onepenceCoin > 0) {
			System.out.println(onepenceCoin + " One pence coin(s)");
		}
	}
}