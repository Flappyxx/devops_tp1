package com.example.devops_tp1.controller;

import com.example.devops_tp1.model.Hand;
import com.example.devops_tp1.model.Wall;
import com.example.devops_tp1.service.MahjongService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mahjong")
public class MahjongController {

    private final MahjongService mahjongService;

    public MahjongController(MahjongService mahjongService) {
        this.mahjongService = mahjongService;
    }

    @GetMapping("/wall")
    public Wall getWall() {
        return mahjongService.getWall();
    }

    @GetMapping("/hand/starting")
    public Hand drawStartingHand() {
        return mahjongService.drawStartingHand();
    }
}