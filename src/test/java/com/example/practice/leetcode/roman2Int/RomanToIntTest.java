package com.example.practice.leetcode.roman2Int;


import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntTest {

//    Example 1:
//
//    Input: s = "III"
//    Output: 3
//    Explanation: III = 3.
//    Example 2:
//
//    Input: s = "LVIII"
//    Output: 58
//    Explanation: L = 50, V= 5, III = 3.
//    Example 3:
//
//    Input: s = "MCMXCIV"
//    Output: 1994
//    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

    @Test
    void when_input_is_iii() {
        RomanToInt romanToInt = new RomanToInt();
        assertEquals(3, romanToInt.romanToInt("III"));
    }
}