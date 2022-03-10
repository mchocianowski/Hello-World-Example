package com.qa.conditionals;

public class Blackjack {

	public int gamePlay(int cardOne, int cardTwo) {
		if (cardOne >= 0 && cardOne <= 21 && cardTwo >= 0 && cardTwo <= 21) {
			return Math.max(cardOne, cardTwo);
		} else if (cardOne >= 0 && cardOne > 21 && cardOne >= 0 && cardTwo <= 21) {
			return cardTwo;
		} else {
			return 0;
		}
	}
}
