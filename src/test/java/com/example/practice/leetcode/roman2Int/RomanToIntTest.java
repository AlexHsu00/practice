package com.example.practice.leetcode.roman2Int;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntTest {
    private RomanToInt romanToInt = new RomanToInt();
    @Test
    void when_input_is_III() {
        assertEquals(3, romanToInt.romanToIntV1("III"));
        assertEquals(3, romanToInt.romanToIntV2("III"));
        assertEquals(3, romanToInt.romanToIntV3("III"));
    }

    @Test
    void when_input_is_LVIII() {
        assertEquals(58, romanToInt.romanToIntV1("LVIII"));
        assertEquals(58, romanToInt.romanToIntV2("LVIII"));
        assertEquals(58, romanToInt.romanToIntV3("LVIII"));
    }

    @Test
    void when_input_is_MCMXCIV() {
        assertEquals(1994, romanToInt.romanToIntV1("MCMXCIV"));
        assertEquals(1994, romanToInt.romanToIntV2("MCMXCIV"));
        assertEquals(1994, romanToInt.romanToIntV3("MCMXCIV"));
    }
}