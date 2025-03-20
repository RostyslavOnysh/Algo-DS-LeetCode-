package LeetCode.monteCarlo;

public class Solution {
    private static final int TOTAL_WHITE_BALLS = 50;
    private static final int TOTAL_BLACK_BALLS = 50;

    public static double calculateOptimalProbability() {
        int wA = 1, bA = 0;
        int wB = TOTAL_WHITE_BALLS - 1, bB = TOTAL_BLACK_BALLS;

        double probabilityA = (double) wA / (wA + bA);
        double probabilityB = (double) wB / (wB + bB);

        return 0.5 * probabilityA + 0.5 * probabilityB;
    }

    public static void main(String[] args) {
        double probability = calculateOptimalProbability();
        System.out.printf("Probability of drawing a white ball: %.5f (%.2f%%)%n", probability, probability * 100);
    }
}
