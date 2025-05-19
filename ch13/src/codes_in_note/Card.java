package codes_in_note;

import java.awt.image.CropImageFilter;

public class Card {
    private int suit;
    private  int rank;

    public Card(int rank,int suit) {
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

    //4. comparedTo method
    public int comparedTo(Card that){
      if(this.suit<that.suit){
          return -1;
      }
      if(this.suit>that.suit){
          return 1;
      }
      if(this.rank<that.rank){
          return -1;
      }
      if(this.rank> that.rank){
          return 1;
      }
      return 0;
    }

    public boolean equals(Card obj){
        return  (this.suit == obj.suit && this.rank==obj.rank);
    }

    //7. Sequential Search
    public static int search(Card[] cards,Card target){
        for (int i=0; i<cards.length; i++){
            if(cards[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

    //8. Binary Search
    public static int binarySearch(Card[] cards, Card target){
        int low = 0;
        int high = cards.length-1;

        while (low<=high ){
            int mid = (low+high)/2;
            System.out.println(low + "," +high);

            if(cards[mid].comparedTo(target)==0){
                return mid;
            }
            if(cards[mid].comparedTo(target)<0){
                low=mid+1;
            }
            if(cards[mid].comparedTo(target)>0){
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        //1. card objets
        //Card c1 = new Card(3,0);
        //Card c2 = new Card(3,0);

        //System.out.println(c1); //call toString automatically

        //System.out.println(c1.comparedTo(c2)); //use comparedTo

        //6. Array of Cards
        //Card[] cards = new Card[52];

//        Card[] cards1 = {
//                new Card(1,0),
//                new Card(2,2),
//                new Card(3,2),
//                new Card(4,3)
//        };

//        int index=0;
//        for(int suit=0;suit<4;suit++){
//            for (int rank=1;rank<14;rank++){
//                cards[index]= new Card(rank,suit);
//                index++;
//            }
//        }

        //System.out.println(cards[0]); //call toString automatically

        //System.out.println(cards[1].comparedTo(cards[2])); //use comparedTo

//        int s = search(cards1, new Card(3,2));
//        System.out.println(s);

//        int result= binarySearch(cards1, new Card(4,3));
//        System.out.println(result);
    }
}
