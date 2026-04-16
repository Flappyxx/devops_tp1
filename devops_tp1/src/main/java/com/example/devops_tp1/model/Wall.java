package com.example.devops_tp1.model;

import java.util.*;

public class Wall {

    private final Deque<Tile> tiles = new ArrayDeque<>();

    public Wall() {
        generate();
        shuffle();
    }

    private void generate() {

        for (Suit suit : List.of(Suit.MAN, Suit.PIN, Suit.SOU)) {
            for (int rank = 1; rank <= 9; rank++) {
                for (int i = 0; i < 4; i++) {
                    tiles.add(new Tile(suit, rank));
                }
            }
        }

        for (int rank = 1; rank <= 7; rank++) {
            for (int i = 0; i < 4; i++) {
                tiles.add(new Tile(Suit.HONOR, rank));
            }
        }
    }

    private void shuffle() {
        List<Tile> temp = new ArrayList<>(tiles);
        Collections.shuffle(temp);
        tiles.clear();
        tiles.addAll(temp);
    }

    public Tile draw() {
        if (tiles.isEmpty()) {
            throw new IllegalStateException("Wall is empty");
        }
        return tiles.removeFirst();
    }

    public int remaining() {
        return tiles.size();
    }

    public List<Tile> getTiles() {
        return new ArrayList<>(tiles);
    }
}