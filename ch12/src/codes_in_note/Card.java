package codes_in_note;

public class Card {

    private final int rank;
    private final int suit;

    public int getRank(){
        return this.rank;
    }
    public int getSuit(){
        return this.suit;
    }

    public static final String[] RANKS = {null,"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    public static final String[] SUITS = {"Clubs","Diamonds","Hearts","Spades"};

    public Card(int rank, int suit){
        this.rank=rank;
        this.suit=suit;
    }

    public String toString(){
        String s = RANKS[this.rank] + " of " + SUITS[this.suit];
        return s;
    }

    public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }

    public static void printCards(Card[] cards){
        for (Card card: cards){
            System.out.println(card);
        }
    }


    public static void main(String[] args) {

        Card[] cards = new Card[52];

        int index=0;
        for (int suit=0; suit<4; suit++){
            for (int rank=0; rank<13; rank++){
                cards[index]=new Card(rank,suit);
                index ++;
            }
        }

        printCards(cards);

//        Card threeOfClubs = new Card(12,3);
//
//        Card c1 =  new Card(3,0);
//        Card c2 = new Card(4,2);
//
//        System.out.println(c1.compareTo(c2));
//
//        System.out.println(threeOfClubs.toString());
//        System.out.println(threeOfClubs);
    }
}
