package com.example.devops_tp1.controller;

import com.example.devops_tp1.service.MahjongService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MahjongController.class)
class MahjongControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MahjongService mahjongService;

    @Test
    void shouldReturnWall() throws Exception {
        when(mahjongService.getWall()).thenReturn(new com.example.devops_tp1.model.Wall());

        mockMvc.perform(get("/api/mahjong/wall"))
                .andExpect(status().isOk());
    }

    @Test
    void shouldReturnStartingHand() throws Exception {
        when(mahjongService.drawStartingHand())
                .thenReturn(new com.example.devops_tp1.model.Hand());

        mockMvc.perform(get("/api/mahjong/hand/starting"))
                .andExpect(status().isOk());
    }
}