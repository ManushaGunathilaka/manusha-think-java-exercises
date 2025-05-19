package play_the_game;

import java.util.ArrayList;

public class Pile {
    private ArrayList<Card> cards;

    // Constructor: initializes an empty pile
    public Pile() {
        this.cards = new ArrayList<Card>();
    }

    // Removes and returns the top card (first in the list)
    public Card popCard() {
        return this.cards.remove(0);
    }

    // Adds a card to the bottom (end of the list)
    public void addCard(Card card) {
        this.cards.add(card);
    }

    // Checks if the pile is empty
    public boolean isEmpty() {
        return this.cards.isEmpty();
    }

    // Adds all cards from a Deck to this pile
    public void addDeck(Deck deck) {
        for (Card card : deck.getCards()) {
            this.cards.add(card);
        }
    }

    // Optional: Returns the current size of the pile
    public int size() {
        return this.cards.size();
    }

    // Optional: Prints all cards in the pile
    public void printPile() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }
}