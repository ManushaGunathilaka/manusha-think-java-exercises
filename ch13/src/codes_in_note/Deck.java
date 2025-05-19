package codes_in_note;

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

    //selection sort
    private void selectionSort() {
        for (int i = 0; i < cards.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < cards.length; j++) {
                if (cards[j].comparedTo(cards[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            // swap cards[i] and cards[minIndex]
            Card temp = cards[i];
            cards[i] = cards[minIndex];
            cards[minIndex] = temp;
        }
    }


    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.print();

        System.out.println("\n after shuffled \n");
        deck.shuffle();
        deck.print();

        deck.selectionSort();
        System.out.println("\nAfter sorting:");
        deck.print();
    }

}
