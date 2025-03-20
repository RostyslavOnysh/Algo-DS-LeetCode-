package LeetCode.monteCarlo;

import java.util.Random;
import java.util.stream.IntStream;

public class BallDistributionSimulator {

    private static final int TOTAL_WHITE_BALLS = 50;
    private static final int TOTAL_BLACK_BALLS = 50;
    private static final int SIMULATIONS = 1_000_000;

    private final BallContainer[] baskets;
    private final Random random;

    public BallDistributionSimulator() {
        baskets = new BallContainer[]{
                new BallContainer(1, 0),
                new BallContainer(TOTAL_WHITE_BALLS - 1, TOTAL_BLACK_BALLS)
        };
        random = new Random();
    }

    public double simulateProbability() {
        long whiteCount = IntStream.range(0, SIMULATIONS)
                .parallel()
                .filter(i -> {
                    BallContainer chosenBasket = random.nextBoolean() ? baskets[0] : baskets[1];
                    return random.nextDouble() < chosenBasket.getWhiteProbability();
                })
                .count();

        return (double) whiteCount / SIMULATIONS;
    }

    public static void main(String[] args) {
        BallDistributionSimulator simulator = new BallDistributionSimulator();
        double probability = simulator.simulateProbability();
        System.out.printf("Probability of drawing a white ball: %.5f (%.2f%%)%n", probability, probability * 100);
    }
}