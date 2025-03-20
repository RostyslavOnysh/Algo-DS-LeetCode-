package LeetCode.task_500_Keyboard_Row;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private static final Map<Character, Integer> keyboardMap = new HashMap<>();

    static {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        for (char c : row1.toCharArray()) {
            keyboardMap.put(c, 1);
        }
        for (char c : row2.toCharArray()) {
            keyboardMap.put(c, 2);
        }
        for (char c : row3.toCharArray()) {
            keyboardMap.put(c, 3);
        }
    }

    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            String lowerWord = word.toLowerCase();
            char firstChar = lowerWord.charAt(0);
            Integer row = keyboardMap.get(firstChar);
            if (row == null) {
                continue;
            }
            boolean valid = true;
            for (int i = 1; i < lowerWord.length(); i++) {
                char c = lowerWord.charAt(i);
                Integer currentRow = keyboardMap.get(c);
                if (currentRow == null || !currentRow.equals(row)) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                result.add(word);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}