package core;



	public class Card // Card class  contains a rank and suit variable
	{
	    private short rank, suit; ////
	    private static String[] suits = { "H", "S", "D", "C" };
	    private static String[] ranks  = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	    public static String rankAsString( int __rank ) {
	    	return ranks[__rank];
	    }

	    Card(short suit, short rank) //constructor
	    {
	        this.rank=rank;
	        this.suit=suit;
	    }

	    public @Override String toString()
	    {
	          return ranks[rank] + " of " + suits[suit];
	    }

	    public short getRank() {
	         return rank;
	    }

	    public short getSuit() {
	        return suit;
	    }

	} // end of class
