
public class Card {

    private final String [] VALID_RANKS =
            {"2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" ,
                    "10" , "jack" , "queen" , "king" , "ace" };

    private final String [] VALID_SUITS ={"diamonds", "clubs", "hearts","spades"};

    private String rank ;

    private String suit ;

    private boolean isValidRank ( String someRank ) {
        return contains ( VALID_RANKS , someRank );
    }

    private boolean isValidSuit ( String someSuit ) {
        return contains ( VALID_SUITS , someSuit );
    }

    private boolean contains ( String [] array , String item ) {
        for ( String element : array ) {
            if ( element . equals ( item )) {
                return true ;
            }
        }
        return false ;
    }

    public String toString () {
        return this.rank + " of " + this.suit ;
    }

    public void setRank ( String rank ) {
        if (! this.isValidRank ( rank )) {
            System.out . println ( rank + " is not a valid rank .");
            System.exit (0) ;
        }
        this.rank = rank ;
    }
    public void setSuit ( String suit ) {
        if (! this.isValidSuit ( suit )) {
            System.out . println ( suit + " is not a valid suit .");
            System.exit (0) ;
        }
        this.suit = suit ;
    }

    /*public static void main ( String [] args ) {
        Card swedishPop = new Card () ;
        swedishPop.rank = " ace " ;
        swedishPop.suit = " base ";

        Card handy = new Card () ;
        handy.rank = " jack " ;
        handy.suit = " all trades ";

        System.out.println ( swedishPop ) ;
        System.out.println ( handy );

    }*/
}
