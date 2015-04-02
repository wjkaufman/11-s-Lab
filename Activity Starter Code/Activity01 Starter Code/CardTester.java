/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card a = new Card("5","Kings",40);
		Card b = new Card("10","Jasons",40);
		Card c = new Card("10","Jasons",40);
		Card d = new Card("Jack","Evans",40);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		System.out.println(a.matches(b));
		System.out.println(b.matches(c));
		System.out.println(c.matches(d));
		System.out.println(d.matches(a));


	}
}
