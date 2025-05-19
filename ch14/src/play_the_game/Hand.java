package play_the_game;

public class Hand extends CardCollection {
    public Hand(String label) {
        super(label);
    }

    public int score() {
        int total = 0;
        for (Card card : cards) {
            total += card.getScore();
        }
        return total;
    }
}

