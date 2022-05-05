package com.example.practice.leetcode.fizzBuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    public void n_is_3() {
        assertEquals(List.of("1", "2", "Fizz"), new FizzBuzz().fizzBuzz(3));
    }

    @Test
    void n_is_5() {
        assertEquals(List.of("1","2","Fizz","4","Buzz"), new FizzBuzz().fizzBuzz(5));
    }

    @Test
    void n_is_15() {
        assertEquals(List.of("1","2","Fizz","4","Buzz","Fizz","Alex","8","Fizz","Buzz","11","Fizz","13","Alex","FizzBuzz"), new FizzBuzz().fizzBuzz(15));
    }

    @Test
    void n_is_7() {
        assertEquals(List.of("1","2","Fizz","4","Buzz", "Fizz", "Alex"), new FizzBuzz().fizzBuzz(7));
    }

    @Test
    void n_is_21() {
        assertEquals(List.of("1","2","Fizz","4","Buzz","Fizz",
                "Alex","8","Fizz","Buzz","11","Fizz",
                "13","Alex","FizzBuzz",
                "16","17","Fizz",
                "19","Buzz","FizzAlex"
        ), new FizzBuzz().fizzBuzz(21));
    }

    @Test
    void n_is_35() {
        assertEquals(List.of("1","2","Fizz","4","Buzz","Fizz",
                "Alex","8","Fizz","Buzz","11","Fizz",
                "13","Alex","FizzBuzz",
                "16","17","Fizz",
                "19","Buzz","FizzAlex",
                "22","23","Fizz",
                "Buzz","26","Fizz",
                "Alex","29","FizzBuzz",
                "31","32","Fizz",
                "34","BuzzAlex"
        ), new FizzBuzz().fizzBuzz(35));
    }
}