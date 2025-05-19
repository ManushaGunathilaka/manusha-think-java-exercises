package play_the_game;

import java.util.Scanner;

public class Eights {
    private Player one;
    private Player two;
    private Hand drawPile;
    private Hand discardPile;
    private Scanner in;

    public Eights() {
        Deck deck = new Deck("Deck");
        deck.shuffle();

        int handSize = 5;
        one = new Player("Alice");
        two = new Player("Bob");

        drawPile = new Hand("Draw pile");
        discardPile = new Hand("Discard pile");

        deck.deal(one.getHand(), handSize);
        deck.deal(two.getHand(), handSize);
        deck.dealAll(drawPile);

        Card card = drawPile.popCard();
        discardPile.addCard(card);

        in = new Scanner(System.in);
    }

    public boolean isDone() {
        return one.getHand().isEmpty() || two.getHand().isEmpty();
    }

    public void reshuffle() {
        Card prev = discardPile.popCard();
        discardPile.dealAll(drawPile);
        discardPile.addCard(prev);
        drawPile.shuffle();
    }

    public Card drawCard() {
        if (drawPile.isEmpty()) {
            reshuffle();
        }
        return drawPile.popCard();
    }

    public Player nextPlayer(Player current) {
        return (current == one) ? two : one;
    }

    public void displayState() {
        one.display();
        two.display();
        discardPile.display();
        System.out.println("Draw pile: " + drawPile.size() + " cards");
        in.nextLine();
    }

    public void takeTurn(Player player) {
        Card prev = discardPile.lastCard();
        Card next = player.play(this, prev);
        discardPile.addCard(next);
        System.out.println(player.getName() + " plays " + next);
        System.out.println();
    }

    public void playGame() {
        Player player = one;
        while (!isDone()) {
            displayState();
            takeTurn(player);
            player = nextPlayer(player);
        }
        one.displayScore();
        two.displayScore();
    }

    public static void main(String[] args) {
        Eights game = new Eights();
        game.playGame();
    }
}
