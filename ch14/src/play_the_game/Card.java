package play_the_game;

public class Card {
    private int rank;
    private int suit;

    private static String[] ranks = {
            null, "Ace", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "Jack", "Queen", "King"
    };
    private static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public String toString() {
        return ranks[rank] + " of " + suits[suit];
    }

    public int getScore() {
        if (rank == 8) return 50;
        if (rank >= 10) return 10;
        return rank;
    }
}

