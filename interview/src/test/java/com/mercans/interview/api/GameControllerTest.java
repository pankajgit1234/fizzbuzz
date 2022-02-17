package com.mercans.interview.api;

import com.mercans.interview.service.GameService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class GameControllerTest {

    @InjectMocks
    private GameController mockGameController;
    @Mock
    GameService mockGameService;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(mockGameController).build();
    }

    @Test
    public void playFizzBuzzTest() throws Exception {
        when(mockGameService.playFizzBuzz(any())).thenReturn("");

        this.mockMvc.perform(get("/api/v1/games/fizzbuzz/5")).andExpect(status().isOk());
    }

    @Test
    public void playFizzBuzzTestForNegativeNumber() throws Exception {
        when(mockGameService.playFizzBuzz(any())).thenReturn("");

        this.mockMvc.perform(get("/api/v1/games/fizzbuzz/-5")).andExpect(status().isOk());
    }
}