package com.example.devops_tp1.model;

public enum Suit {
    MAN("m"),
    PIN("p"),
    SOU("s"),
    HONOR("z");

    public final String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }
}