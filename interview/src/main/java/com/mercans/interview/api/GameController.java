package com.mercans.interview.api;

import com.mercans.interview.exception.InvalidNumberException;
import com.mercans.interview.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/fizzbuzz/{number}")
    ResponseEntity<String> getFizzBuzzSeries(@PathVariable(value = "number") Integer number) throws InvalidNumberException {
      String response =  gameService.playFizzBuzz(number);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
