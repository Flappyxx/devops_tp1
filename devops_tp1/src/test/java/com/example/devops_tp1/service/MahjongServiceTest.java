package com.example.devops_tp1.service;

import com.example.devops_tp1.model.Hand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MahjongServiceTest {

    @Test
    void shouldCreateStartingHandOf13Tiles() {
        MahjongService service = new MahjongService();

        Hand hand = service.drawStartingHand();

        assertEquals(13, hand.size());
    }

    @Test
    void shouldDecreaseWallAfterDrawing() {
        MahjongService service = new MahjongService();

        int before = service.getWall().remaining();

        service.drawStartingHand();

        int after = service.getWall().remaining();

        assertEquals(before - 13, after);
    }

    @Test
    void shouldNotReturnNullTiles() {
        MahjongService service = new MahjongService();

        Hand hand = service.drawStartingHand();

        assertTrue(hand.getTiles().stream().allMatch(t -> t != null));
    }
}