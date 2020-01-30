package game_zone;

public class PickTwoCards {

	public static void main(String[] args) {
		final int CARDS_IN_SUIT = 13;
		char suit [] = {'s', 'c', 'h', 'd'};
		int myValue;
		int yourValue;
		int r1 = ((int)(Math.random() * suit.length));
		int r2 = ((int)(Math.random() * suit.length));
		myValue = ((int)(Math.random() * 100 )% CARDS_IN_SUIT + 1);
		yourValue = ((int)(Math.random() * 100 )% CARDS_IN_SUIT + 1);
		
		Card myCard = new Card();
		Card yourCard = new Card();
		
		myCard.setValue(myValue);
		yourCard.setValue(yourValue);
		myCard.setSuit(suit [r1]);
		yourCard.setSuit(suit [r2]);
		
		System.out.println("My card us the " + myCard.getValue() + " of " + myCard.getSuit());
		System.out.println("My card us the " + yourCard.getValue() + " of " + yourCard.getSuit());
		
	}

}
