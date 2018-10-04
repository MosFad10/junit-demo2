package core;

	import java.util.Random;
	import java.util.ArrayList;

	public class Deck {
	    private ArrayList<Card> cards;

	     Deck()
	     {
	    	 cards = new ArrayList<Card>(); //in this assign, we can use Array instead
	         int index_1, index_2;

	         Random generator = new Random();
	         //generator.nextInt( 52 ); ---> between  0 and 51
	        Card temp;

	        for (short a=1; a<=4; a++)
	        {
	        	for (short b=1; b<=13; b++)
	             {
	               cards.add(new Card(a,b));
	             }
	        }

	        //int size      
	        /*
	        for (int i=0; i<100; i++) //shuffling our deck
	        {
	            index_1 = generator.nextInt( cards.size() - 1 );
	            index_2 = generator.nextInt( cards.size() - 1 );

	            temp = cards.get( index_2 );
	            cards.set( index_2 , cards.get( index_1 ) );
	            cards.set( index_1, temp );
	        } */
	    } //end of constructor

	    public Card drawFromDeck()
	    {     
	        return cards.remove( 0 ); //To draw from the deck, we just return the first element/card
	    }
	    // see assumption on p2
   
	} //end of class