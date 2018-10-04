package core;

/*
 we can write some test code and see this stuff at work. 
 Our first main method will test the randomness of the deck we made
 */
public class Main {

	    public static void main(String[] args)
	    {
	    	Deck deck= new Deck();
	        Card C;
	        System.out.println( deck.getTotalCards() );
	        while (deck.getTotalCards()!=0 )
	       {
	           C = deck.drawFromDeck();
	           System.out.println( C.toString() );
	       }
	   
	    
	    ///***
	        for (int i=0; i<100; i++)
      		       {
	  	        		 //Deck deck= new Deck();
        		          Hand hand= new Hand(deck);
	        		      hand.display(); //show the summary of the hand, e.g. "full house"
	        		      hand.displayAll(); //look at all the individual cards in the hand      
	        		 }
	        
	        //compare
	        for (int i=0; i<20000; i++)
	        	      {
	     	        	//Deck deck= new Deck();
	     	        	 Hand hand= new Hand(deck);
	        		       Hand hand2= new Hand(deck);
	        		       hand.display();
	        		       hand.displayAll();
	        		       hand2.display();
	           		       hand2.displayAll();
		        		    System.out.println(hand.compareTo(hand2));
	        	
	        		       } 
	    }
	}
