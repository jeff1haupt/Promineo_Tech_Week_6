package week6;

import java.util.Collections;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		deck.shuffle();
		for(Card card: deck.cards) {
			System.out.println(card.describe());
		}
	}

}
