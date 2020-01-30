package game_zone;

public class Card {
	
		private char suit;
		private int value;
		private int value2;
			
		public void setSuit(char s) {
			suit = s;
	}
		public char getSuit() {
			return suit;
		}
	
		public int getValue() {
			return value; 
		}
		public void setValue(int v, int v2) {
			value = v;
			value = v2;
		}

}
