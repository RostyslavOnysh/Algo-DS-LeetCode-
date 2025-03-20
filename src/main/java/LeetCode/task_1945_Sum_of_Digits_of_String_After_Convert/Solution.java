package LeetCode.task_1945_Sum_of_Digits_of_String_After_Convert;

public class Solution {
    public int getLucky(String s, int k) {
        StringBuilder numString = new StringBuilder();
        for (char c : s.toCharArray()) {
            numString.append(c - 'a' + 1);
        }
        while (k-- > 0) {
            int sum = 0;
            for (char digit : numString.toString().toCharArray()) {
                sum += digit - '0';
            }
            numString = new StringBuilder(String.valueOf(sum));
            if (sum < 10) break;
        }
        return Integer.parseInt(numString.toString());
    }
}
