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


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> fizzBuzz(int n) {
        List<Integer> divisors = List.of(3, 5, 7);
        List<String> strings = List.of("Fizz", "Buzz", "Alex");

        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            String resultStr = "";
            for (int divisorsIdx = 0; divisorsIdx < divisors.size(); divisorsIdx++) {

                boolean divisible = i % divisors.get(divisorsIdx) == 0;
                if (divisible) {
                    resultStr = resultStr + strings.get(divisorsIdx);
                }
            }

            if(resultStr.isEmpty()){
                resultStr = String.valueOf(i);
            }

            result.add(resultStr);

        }
        return result;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
