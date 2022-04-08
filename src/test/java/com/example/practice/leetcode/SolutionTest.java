package com.example.practice.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void n_is_3() {
        assertEquals(List.of("1", "2", "Fizz"), new Solution().fizzBuzz(3));
    }

    @Test
    void n_is_5() {
        assertEquals(List.of("1","2","Fizz","4","Buzz"), new Solution().fizzBuzz(5));
    }

    @Test
    void n_is_15() {
        assertEquals(List.of("1","2","Fizz","4","Buzz","Fizz","Alex","8","Fizz","Buzz","11","Fizz","13","Alex","FizzBuzz"), new Solution().fizzBuzz(15));
    }

    @Test
    void n_is_7() {
        //n = 7
        // n = 21
        // n = 35
        // n = 105
        assertEquals(List.of("1","2","Fizz","4","Buzz", "Fizz", "Alex"), new Solution().fizzBuzz(7));
    }

}