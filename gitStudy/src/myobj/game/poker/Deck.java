package myobj.game.poker;

import java.util.Collections;
import java.util.LinkedList;

public class Deck {

	LinkedList<Card> deck;

	public Deck() {
		deck = new LinkedList<>();
		
		for (Rank rank : Card.RANKS) {
			
			for (Suit suit : Card.SUITS){
				deck.add(new Card(suit, rank));
			}
		}
		Collections.shuffle(deck); // ����
	}
	
	public Card draw() {
		return deck.pop();
	}
	
	@Override
	public String toString() {
		return deck.toString();
	}
	
	public static void main(String[] args) {
		Deck d1 = new Deck();
		System.out.println(d1);
		
		//5�� �̾ƺ���
		
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		System.out.println(d1.draw());
		
		System.out.println(d1);
	}
}
















