package onecard;

import java.util.ArrayList;

public class OneCardDeck {
	
	ArrayList<Card> cards;
	
	public OneCardDeck() {
		cards = new ArrayList<>();
		
		// 하트 JOKER를 칼라 조커, 스페이드 JOKER 흑백 조커
		for (Character suit : Card.SUITS) {
			for (String rank : Card.RANKS) {
				
				if (suit.equals('◇') && rank.equals("JOKER")) {
					continue;
				} else if (suit.equals('♣') && rank.equals("JOKER")) {
					continue;
				} else {
					cards.add(new Card(suit, rank));					
				}
			}
		}
		System.out.println(cards);
	}
	
	public static void main(String[] args) {
		new OneCardDeck();
	}
}
