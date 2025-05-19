package merge_sort;

import java.util.Random;

public class Deck {

    private Card[] cards;

    public Card[] getCards(){
        return this.cards;
    }

    public Deck(int n){
        this.cards=new Card[n];
    }

    public Deck(){
        this.cards=new Card[52];
        int index=0;
        for(int suit=0;suit<4;suit++){
            for (int rank=1;rank<14;rank++){
                this.cards[index]= new Card(rank,suit);
                index++;
            }
        }
    }

    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }

    //helper 1
    public static Random random = new Random();

    public static int randomInt(int low, int high){
        return random.nextInt(high-low+1)+low;
    }

    //helper2
    public void swapCards(int i,int j){
        Card temp = this.cards[i];
        this.cards[i]=this.cards[j];
        this.cards[j]=temp;
    }

    //shuffle  method
    public void shuffle(){
        for (int i=0;i<cards.length;i++){
            int j = randomInt(i,cards.length-1);
            swapCards(i,j);
        }
    }

    //merge sort

    //split Deck into two parts
    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);      // Create a new deck with required size
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];   // Copy cards from original deck
        }
        return sub;  // Return the subdeck
    }

    //merge helper method
    private static Deck merge(Deck d1, Deck d2) {
        Deck d3 = new Deck(d1.cards.length + d2.cards.length);

        int i = 0; // index for d1
        int j = 0; // index for d2

        for (int k = 0; k < d3.cards.length; k++) {
            if (i >= d1.cards.length) {
                d3.cards[k] = d2.cards[j];
                j++;
            } else if (j >= d2.cards.length) {
                d3.cards[k] = d1.cards[i];
                i++;
            } else {
                // Compare and choose the lower card
                if (d1.cards[i].comparedTo(d2.cards[j]) < 0) {
                    d3.cards[k] = d1.cards[i];
                    i++;
                } else {
                    d3.cards[k] = d2.cards[j];
                    j++;
                }
            }
        }

        return d3;
    }

    //mergeSort Method
    public Deck mergeSort() {
        if (this.cards.length <= 1) {
            return this; // Base case: already sorted
        }

        int mid = this.cards.length / 2;

        Deck d1 = this.subdeck(0, mid - 1);
        Deck d2 = this.subdeck(mid, this.cards.length - 1);

        Deck sorted1 = d1.mergeSort(); // Recursively sort left half
        Deck sorted2 = d2.mergeSort(); // Recursively sort right half

        return merge(sorted1, sorted2); // Merge sorted halves
    }



    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println("\n after shuffled \n");
        deck.shuffle();
        deck.print();


        System.out.println("\nAfter sorting:\n");
        Deck sortedDeck = deck.mergeSort();
        sortedDeck.print();
    }

}
