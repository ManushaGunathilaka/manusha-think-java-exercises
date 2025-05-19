package play_the_game;

import java.util.ArrayList;
import java.util.Collections;

public class CardCollection {
    protected String label;
    protected ArrayList<Card> cards;

    public CardCollection(String label) {
        this.label = label;
        this.cards = new ArrayList<>();
    }

    public String getLabel() {
        return label;
    }

    public Card getCard(int i) {
        return cards.get(i);
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card popCard(int i) {
        return cards.remove(i);
    }

    public Card popCard() {
        return popCard(cards.size() - 1);
    }

    public int size() {
        return cards.size();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card lastCard() {
        return cards.get(cards.size() - 1);
    }

    public void deal(CardCollection that, int n) {
        for (int i = 0; i < n; i++) {
            Card card = popCard();
            that.addCard(card);
        }
    }

    public void dealAll(CardCollection that) {
        int n = cards.size();
        deal(that, n);
    }

    public void display() {
        System.out.println(label + ":");
        for (Card card : cards) {
            System.out.println(card);
        }
        System.out.println();
    }
}

