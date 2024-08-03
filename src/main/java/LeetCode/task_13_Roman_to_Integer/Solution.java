package LeetCode.task_13_Roman_to_Integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int sum = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int currentValue = romanMap.get(s.charAt(i));
            if (i < length - 1 && currentValue < romanMap.get(s.charAt(i + 1))) {
                sum -= currentValue;
            } else {
                sum += currentValue;
            }
        }
        return sum;
    }
}