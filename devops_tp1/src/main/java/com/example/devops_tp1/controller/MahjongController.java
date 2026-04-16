package com.example.devops_tp1.controller;

import com.example.devops_tp1.model.Hand;
import com.example.devops_tp1.model.Wall;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mahjong")
public class MahjongController {

    @GetMapping("/wall")
    public Wall generateWall() {
        return new Wall();
    }

    @PostMapping("/hand/starting")
    public Hand drawStartingHand(@RequestBody Wall wall) {
        Hand hand = new Hand();

        for (int i = 0; i < 13; i++) {
            hand.add(wall.draw());
        }

        return hand;
    }
}
