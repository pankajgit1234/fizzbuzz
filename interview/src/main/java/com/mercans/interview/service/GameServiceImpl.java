package com.mercans.interview.service;

import com.mercans.interview.exception.InvalidNumberException;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {
    @Override
    public String playFizzBuzz(Integer number) throws InvalidNumberException {
        if(!checkPositiveInteger(number)){
            throw new InvalidNumberException("Provide valid positive Integer");
        }
        fizzBuzz(1, 1, 1, number);
        final String gameStatus = "Game Completed";
        return gameStatus;
    }

    private boolean getBooleanValue(int num) {
        return "0".equalsIgnoreCase(Integer.toString(num));
    }

    private void fizzBuzz(int i, int c3, int c5, int number) {
        if (getBooleanValue(i ^ number + 1)) {
            return;
        }

        System.out.print(!getBooleanValue(c3 ^ 3) ? "" : "Fizz");
        System.out.print((getBooleanValue(c3 ^ 3) & getBooleanValue(c5 ^ 5)) ? " " : "");
        System.out.print(!getBooleanValue(c5 ^ 5) ? "" : "Buzz");

        String s = (getBooleanValue(c3 ^ 3) | getBooleanValue(c5 ^ 5)) ? "" : Integer.toString(i);

        System.out.print(s + ",");
        System.out.print(" ");
        c3 = !getBooleanValue(c3 ^ 3) ? c3 : 0;
        c5 = !getBooleanValue(c5 ^ 5) ? c5 : 0;
        fizzBuzz(i + 1, c3 + 1, c5 + 1, number);

    }

    private boolean checkPositiveInteger(int num) {
        return Integer.signum(num) == 1 ? true : false;
    }
}
