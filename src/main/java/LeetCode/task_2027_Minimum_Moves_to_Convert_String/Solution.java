package LeetCode.task_2027_Minimum_Moves_to_Convert_String;

public class Solution {
    public int minMove(String s) {
        int moves = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'X') {
                moves++;
                i += 2;
            }
        }
        return moves;
    }
}
