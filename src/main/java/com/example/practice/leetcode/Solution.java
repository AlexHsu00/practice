package com.example.practice.leetcode;//Given an integer n, return a string array answer (1-indexed) where:
//
// 
// answer[i] == "FizzBuzz" if i is divisible by 3 and 5. 
// answer[i] == "Fizz" if i is divisible by 3. 
// answer[i] == "Buzz" if i is divisible by 5. 
// answer[i] == i (as a string) if none of the above conditions are true. 
// 
//
// 
// Example 1: 
// Input: n = 3
//Output: ["1","2","Fizz"]
// Example 2: 
// Input: n = 5
//Output: ["1","2","Fizz","4","Buzz"]
// Example 3: 
// Input: n = 15
//Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","1
//3","14","FizzBuzz"]
// 
// 
// Constraints: 
//
// 
// 1 <= n <= 10⁴ 
// 
// Related Topics Math String Simulation 👍 279 👎 49


import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> fizzBuzz(int n) {

        Map<Integer, String> integerStringMap = new TreeMap<Integer, String>();
        integerStringMap.put(3, "Fizz");
        integerStringMap.put(5, "Buzz");
        integerStringMap.put(7, "Alex");


        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            String fizzBuzz = "";
            fizzBuzz = divisorAndCompositString(integerStringMap, i);

            if (fizzBuzz.isEmpty()) {
                fizzBuzz = String.valueOf(i);
            }

            result.add(fizzBuzz);

        }
        return result;
    }

    private String divisorAndCompositString(Map<Integer, String> integerStringMap, int i) {
        String fizzBuzz = "";
        for (Map.Entry<Integer, String> entry : integerStringMap.entrySet()) {
            if (i % entry.getKey() == 0) {
                fizzBuzz = fizzBuzz + entry.getValue();
            }
        }
        return fizzBuzz;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
