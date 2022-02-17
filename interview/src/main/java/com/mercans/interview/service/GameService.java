package com.mercans.interview.service;

import com.mercans.interview.exception.InvalidNumberException;

public interface GameService {

    String playFizzBuzz(Integer number) throws InvalidNumberException;
}
