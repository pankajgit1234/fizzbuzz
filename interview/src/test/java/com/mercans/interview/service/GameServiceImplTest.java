package com.mercans.interview.service;

import com.mercans.interview.exception.InvalidNumberException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

/**
 * Test case for {@link GameServiceImpl}
 */
public class GameServiceImplTest {

    private GameServiceImpl gameServiceImpl = null;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        gameServiceImpl = new GameServiceImpl();
    }

    @Test
    public void playFizzBuzzTest() throws InvalidNumberException {

        String gameStatus =
                gameServiceImpl.playFizzBuzz(10);
        assertEquals("Game Completed", gameStatus);

    }

}