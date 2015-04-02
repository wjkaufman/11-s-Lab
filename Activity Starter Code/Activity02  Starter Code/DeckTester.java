/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] aRank = {"A","B"};
		String[] aSuit = {"Kings","Queens"};
		int[] aVals = {2,1};

		Deck aDeck = new Deck(aRank, aSuit, aVals);

		String[] bRank = {"D","E", "F"};
		String[] bSuit = {"Frogs","Deer", "Tesla"};
		int[] bVals = {10,12,1};

		Deck bDeck = new Deck(bRank, bSuit, bVals);

		// String[] cRank = new String[1];
		// String[] cSuit = new String[1];
		// int[] cVals = new int[1];
		//
		// Deck cDeck = new Deck(cRank, cSuit, cVals);

		System.out.println(aDeck.isEmpty());
		System.out.println(bDeck.isEmpty());
		// System.out.println(cDeck.isEmpty());

		System.out.println(aDeck.size());
		System.out.println(bDeck.size());
		// System.out.println(cDeck.size());

		System.out.println(aDeck);
		System.out.println(bDeck);
		// System.out.println(cDeck);

		System.out.println(aDeck.deal());
		System.out.println(bDeck.deal());
		// System.out.println(cDeck.deal());

		System.out.println(aDeck);
		System.out.println(bDeck);
		// System.out.println(cDeck);





	}
}
