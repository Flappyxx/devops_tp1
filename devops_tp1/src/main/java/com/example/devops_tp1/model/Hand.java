package com.example.devops_tp1.model;

import java.util.*;

public class Hand {

    private final List<Tile> tiles = new ArrayList<>();

    public void add(Tile tile) {
        tiles.add(tile);
    }

    public List<Tile> getTiles() {
        return tiles;
    }
}