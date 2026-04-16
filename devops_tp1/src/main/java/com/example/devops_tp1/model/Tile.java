package com.example.devops_tp1.model;

public class Tile {

    private final Suit suit;
    private final int rank;

    public Tile(Suit suit, int rank) {
        validate(suit, rank);
        this.suit = suit;
        this.rank = rank;
    }

    private void validate(Suit suit, int rank) {

        if (suit == null) {
            throw new IllegalArgumentException("Suit cannot be null");
        }

        switch (suit) {
            case MAN, PIN, SOU -> {
                if (rank < 1 || rank > 9) {
                    throw new IllegalArgumentException(
                            "Invalid rank for " + suit + ": " + rank + " (must be 1–9)"
                    );
                }
            }
            case HONOR -> {
                if (rank < 1 || rank > 7) {
                    throw new IllegalArgumentException(
                            "Invalid honor rank: " + rank + " (must be 1–7)"
                    );
                }
            }
        }
    }

    public Suit getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + suit.symbol;
    }
}