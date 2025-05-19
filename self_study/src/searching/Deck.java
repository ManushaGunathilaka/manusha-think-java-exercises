package searching;

import java.util.Stack;

public class Deck {

    private Card[] cards;

    public Deck(){

        this.cards = new Card[52];
        int index =0;
        for(int i=0; i<=3; i++){
            for (int j=1; j<=13; j++){
                this.cards[index] = new Card(i,j);
                index++;
            }
        }
    }

    public void print(){
        for(Card card: cards){
            System.out.println(card);
        }
    }

    private static int search(Deck deck, Card target){
        for (int i=0; i<deck.cards.length-1;i++){
            if (deck.cards[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        Deck deck = new Deck();
        Card card = new Card(0,1);
        deck.print();

        int indexofObject = search(deck,card);

        System.out.println("index of objct is "+indexofObject);
    }
}
