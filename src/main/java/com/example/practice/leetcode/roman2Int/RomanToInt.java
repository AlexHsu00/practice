package com.example.practice.leetcode.roman2Int;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class RomanToInt {

    public int romanToIntV1(String s) {
        return romanCalculatorV1(s, createRomanMapperV1());
    }

    private int romanCalculatorV1(String roman, Map<String, Integer> mapper) {
        List<String> subtractLetter = List.of("I", "X", "C");
        int result = 0;
        char[] charOfRomans = roman.toCharArray();
        for (int i = 0; i < charOfRomans.length; i++) {
            if (i < charOfRomans.length - 1 && subtractLetter.contains(String.valueOf(charOfRomans[i]))) {
                String subtractRoman = String.valueOf(charOfRomans[i]) + charOfRomans[i + 1];
                if (Objects.requireNonNullElse(mapper.get(subtractRoman), 0) > 0) {
                    result += mapper.get(subtractRoman);
                    i++;
                    continue;
                }
            }
            result += mapper.get(String.valueOf(charOfRomans[i]));

        }
        return result;
    }

    private Map<String, Integer> createRomanMapperV1() {
        Map<String, Integer> roman2IntegerMapper = new HashMap<>();
        roman2IntegerMapper.put("I", 1);
        roman2IntegerMapper.put("V", 5);
        roman2IntegerMapper.put("X", 10);
        roman2IntegerMapper.put("L", 50);
        roman2IntegerMapper.put("C", 100);
        roman2IntegerMapper.put("D", 500);
        roman2IntegerMapper.put("M", 1000);
        roman2IntegerMapper.put("IV", 4);
        roman2IntegerMapper.put("IX", 9);
        roman2IntegerMapper.put("XL", 40);
        roman2IntegerMapper.put("XC", 90);
        roman2IntegerMapper.put("CD", 400);
        roman2IntegerMapper.put("CM", 900);
        return roman2IntegerMapper;
    }

    public int romanToIntV2(String s) {
        return romanCalculatorV2(s, createRomanMapperV2());
    }

    private int romanCalculatorV2(String s, Map<String, Integer> mapper) {
        int result = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1 && (mapper.get(String.valueOf(chars[i])) < mapper.get(String.valueOf(chars[i + 1])))) {
                String s1 = String.valueOf(chars[i]) + chars[i + 1];
                result += (mapper.get(String.valueOf(chars[i + 1])) - mapper.get(String.valueOf(chars[i])));
                i++;
                continue;
            }
            result += mapper.get(String.valueOf(chars[i]));
        }
        return result;
    }

    private Map<String, Integer> createRomanMapperV2() {
        Map<String, Integer> roman2IntegerMapper = new HashMap<>();
        roman2IntegerMapper.put("I", 1);
        roman2IntegerMapper.put("V", 5);
        roman2IntegerMapper.put("X", 10);
        roman2IntegerMapper.put("L", 50);
        roman2IntegerMapper.put("C", 100);
        roman2IntegerMapper.put("D", 500);
        roman2IntegerMapper.put("M", 1000);
        return roman2IntegerMapper;
    }

    public int romanToIntV3(String s) {
        return romanCalculatorV3(s, createRomanMapperV3());
    }

    private int romanCalculatorV3(String s, Map<String, Integer> mapper) {
        List<String> ixc = List.of("I", "X", "C");
        int result = 0;
        String[] sp = s.split("");

        for (int i = 0; i < sp.length; i++) {
            if (i < sp.length - 1 && ixc.contains(sp[i])) {
                String s1 = sp[i] + sp[i + 1];
                if (Objects.requireNonNullElse(mapper.get(s1), 0) > 0) {
                    result += mapper.get(s1);
                    i++;
                    continue;
                }
            }
            result += mapper.get(sp[i]);
        }
        return result;
    }

    private Map<String, Integer> createRomanMapperV3() {
        Map<String, Integer> roman2IntegerMapper = new HashMap<>();
        roman2IntegerMapper.put("I", 1);
        roman2IntegerMapper.put("V", 5);
        roman2IntegerMapper.put("X", 10);
        roman2IntegerMapper.put("L", 50);
        roman2IntegerMapper.put("C", 100);
        roman2IntegerMapper.put("D", 500);
        roman2IntegerMapper.put("M", 1000);
        roman2IntegerMapper.put("IV", 4);
        roman2IntegerMapper.put("IX", 9);
        roman2IntegerMapper.put("XL", 40);
        roman2IntegerMapper.put("XC", 90);
        roman2IntegerMapper.put("CD", 400);
        roman2IntegerMapper.put("CM", 900);
        return roman2IntegerMapper;
    }
}
