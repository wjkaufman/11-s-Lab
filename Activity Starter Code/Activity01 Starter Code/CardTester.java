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

		System.out.println( "EXPECTED RESULTS:" );
		System.out.println( "5 of Kings (point value = 40)" );
		System.out.println( "10 of Jasons (point value = 40)" );
		System.out.println( "10 of Jasons (point value = 40)" );
		System.out.println( "Jack of Evans (point value = 40)" );

		System.out.println( "testing toString()..." );
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		System.out.println( "testing matches(card)..." );
		System.out.println(a.matches(b));
		System.out.println(b.matches(c));
		System.out.println(c.matches(d));
		System.out.println(d.matches(a));
		
		System.out.println( "testing suit()..." );
		System.out.println( a.suit() );
		System.out.println( b.suit() );
		System.out.println( c.suit() );
		System.out.println( d.suit() );

		System.out.println( "testing rank()..." );
		System.out.println( a.rank() );
		System.out.println( b.rank() );
		System.out.println( c.rank() );
		System.out.println( d.rank() );
		
		System.out.println( "testing pointValue()..." );
		System.out.println( a.pointValue() );
		System.out.println( b.pointValue() );
		System.out.println( c.pointValue() );
		System.out.println( d.pointValue() );
		
	}
}
