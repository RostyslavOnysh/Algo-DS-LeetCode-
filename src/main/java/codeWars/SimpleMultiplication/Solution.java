package codeWars.SimpleMultiplication;

public class Solution {
    public static int simpleMultiplication(int n) {
        return (n % 2 == 0) ? n * 8 : n * 9;
    }
}
