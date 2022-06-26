package com.example.practice.leetcode.countingBits;

import org.junit.jupiter.api.Test;

class CountBitsTest {
    //  TODO
    //      0 -->     0
    //      1 -->     1
    //      2 -->    10
    //      3 -->    11
    //      4 -->   100
    //      5 -->   101
    //      6 -->   110
    //      7 -->   111
    //      8 -->  1000
    //      when even last number must 0
    //      when odd last number must 1
    //      using division and count divide times
    @Test
    void name() {
        CountBits countBits = new CountBits();
        countBits.countBits(3);
    }
}