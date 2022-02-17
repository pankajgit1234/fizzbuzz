# fizzbuzz
Spring boot Application for for Fizz Buzz. This application implements below requirements.

**Requirements**
Implement the "enterprise" version of FizzBuzz (https://en.wikipedia.org/wiki/Fizz_buzz).

You can use any technology you want to solve this task.

Ideas/methods to use (all items are optional and might not be applicable at all):

- No switch, no comparisons (<,>,<=,>=, ==, ===, !=, !==, <>)
- At most 1 if statement
- No loops (for, while, do...while, steams ...)
- No %, /, *, -
- Only +
- Dockerize the application

**API details:-**
end point :- http://localhost:8085/api/v1/games/fizzbuzz/<number>
  number should be a positive integer.
Response :- 
  Game Completed
  It will print on console as per below example till the provided number as provided in api endpoint. 
    1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, ...
  
**How to run in a docker container:-**
 command to create docker image
      docker build -f Dockerfile -t docker-fizz-buzz .
  command to run docker image
     docker run -p 8085:8085 docker-fizz-buzz
     
  
  
