package searching;

public class Card {
    private int suit;
    private  int rank;

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    //2. class variables
    public static final String[] SUITS = {"clubs","diamonds","hearts","spades"};
    public static final String[] RANKS = {null,"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};


    //2. toString method
    public String toString(){
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }

    public boolean equals(Card obj){
        return  (this.suit == obj.suit && this.rank==obj.rank);
    }

    public static void main(String[] args) {

    }
}
