package com.example.devops_tp1.service;

import com.example.devops_tp1.model.Hand;
import com.example.devops_tp1.model.Wall;
import org.springframework.stereotype.Service;


@Service
public class MahjongService {

    private final Wall wall = new Wall();

    public Wall getWall() {
        return wall;
    }

    public Hand drawStartingHand() {
        Hand hand = new Hand();

        for (int i = 0; i < 13; i++) {
            hand.add(wall.draw());
        }

        return hand;
    }
}