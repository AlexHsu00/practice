package com.example.practice.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    //    Input: n = 3
//    Output: ["1","2","Fizz"]
//    Example 2:
//
//    Input: n = 5
//    Output: ["1","2","Fizz","4","Buzz"]
//    Example 3:
//
//    Input: n = 15
//    Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
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
        assertEquals(List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"), new Solution().fizzBuzz(15));
    }
}