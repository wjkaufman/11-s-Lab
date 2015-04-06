/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal Remaining 5 Cards ****");
		for (int i = 0; i < 5; i++) {
			System.out.println("  deal: " + d.deal());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After All Cards Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		String[] suit = { "hearts", "diamonds", "spades", "clubs" };
		String[] rank = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		int[] pointValue = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		Deck stdDeck = new Deck( rank, suit, pointValue );

		System.out.println( "**** Initial 52 card deck ****" );
		System.out.println("  toString:\n" + stdDeck.toString());
		System.out.println("  isEmpty: " + stdDeck.isEmpty());
		System.out.println("  size: " + stdDeck.size());
		System.out.println();
		System.out.println();

		stdDeck.shuffle();

		System.out.println( "**** Shuffled 52 card deck ****" );
		System.out.println("  toString:\n" + stdDeck.toString());
		System.out.println("  isEmpty: " + stdDeck.isEmpty());
		System.out.println("  size: " + stdDeck.size());
		System.out.println();
		System.out.println();
	}
}
